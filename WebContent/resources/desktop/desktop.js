var lastIndex;
$(function() {
    initPage();
});
function initPage() {
    initPortal();
}
// 初始化Portal
function initPortal() {
    $('#desktop').portal({
	 border : false
    });
    //将PANEL禁止拖动
    var panels = $('#desktop').portal("getPanels");
    for(var i=0;i<panels.length;i++){
	$('#desktop').portal("disableDragging",panels[i]);
    }
}
function showPlugTempsPanel(){
    $("#win_plugtemps").window({
	title:'管理组件模版',
	onOpen:function(){
	    initTempGrid();
	}
    });
    $("#win_plugtemps").window("open");
}
function initTempGrid(){
    
    var cols = [ {
	field : 'hometemplatesname',
	title : '组件模板名称'
    }, {
	field : 'modifieuser',
	title : '最新修改人'
    },{
	field : 'modifiedtime',
	title : '最新修改时间'
    },{
	field : 'relRoles',
	title : '关联角色'
    },{
	field : 'relRoleIds',
	title : '关联角色ID',
	hidden:true
    }];
    cols = setDefWidth(cols, 80);
    $('#plugtemps').datagrid({
	url:'crm/hometemplates/loadlist',
	collapsible : false,
	idField : 'hometemplatesid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	fit:true,
	border:false,
	pageSize:10,
	toolbar : [{
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		$("#win_plugtempsedit").window({
		    title:'新增组件模版',
		    onOpen:function(){
			
			$("#form_plugtempsedit").form("clear");
			$(".validatebox-tip").hide();
			
			$("#form_plugtempsedit").find("input[name=hometemplatesid]").val(0);
			
			//加载没有模版组件的权限
			var trs = "<tr>";
			$.get("crm/role/getRolesWithoutTemplates",null,function(res){
			    for(var i=0;i<res.length;i++){
				if(i==0){
				    trs += "<td width=\"33%\">"+res[i].rolename+"<input type=\"checkbox\" name=\"roleid\" value=\""+res[i].roleid+"\" /></td>"
				}else if(i%3==0 && i<res.length-1){
				    trs += "</tr>"
				    trs += "<tr>";
				}else{
				    trs += "<td width=\"33%\">"+res[i].rolename+"<input type=\"checkbox\" name=\"roleid\" value=\""+res[i].roleid+"\" /></td>"
				}
				
				if(i==res.length-1){
				    var re = (i+1)%3;
				    for(var j=1;j<re;j++){
					trs +="<td width=\"33%\"></td>";
				    }
				    trs +="</tr>";
				}
			    }
			    $("#tab_role").html("");
			    $("#tab_role").append(trs);
			},'json');
		    }
		});
		$("#win_plugtempsedit").window("open");
	    }
	},{
	    text : '编辑',
	    iconCls:'icon-edit',
	    handler : function() {
		
		$("#form_plugtempsedit").form("clear");
		$(".validatebox-tip").hide();
		
		var selected = $('#plugtemps').datagrid('getSelected');
		if (selected) {
		    $("#win_plugtempsedit").window({
			title:'编辑组件模版',
			onOpen:function(){
			    
			    var hometemplatesid = selected.hometemplatesid;
			    $("#form_plugtempsedit").find("input[name=hometemplatesid]").val(hometemplatesid);
			    $("#form_plugtempsedit").find("input[name=hometemplatesname]").val(selected.hometemplatesname);
			    
			    //加载数据
			    var trs = "<tr>";
			    $.get('crm/hometemplates/getHometemplates',{hometemplatesid:hometemplatesid},function(res){
				   for(var i=0;i<res.relRoles.length;i++){
				       	var ck = "";
				       	if(res.relRoles[i].relTemplate == true){
				       	    ck = "checked=\"checked\"";
				       	}
					if(i==0){
					    trs += "<td width=\"33%\">"+res.relRoles[i].rolename+"<input type=\"checkbox\" "+ck+" name=\"roleid\" value=\""+res.relRoles[i].roleid+"\" /></td>";
					}else if(i%3==0 && i<res.length-1){
					    trs += "</tr>"
					    trs += "<tr>";
					}else{
					    trs += "<td width=\"33%\">"+res.relRoles[i].rolename+"<input type=\"checkbox\" "+ck+" name=\"roleid\" value=\""+res.relRoles[i].roleid+"\" /></td>"
					}
					
					if(i==res.length-1){
					    var re = (i+1)%3;
					    for(var j=1;j<re;j++){
						trs +="<td width=\"33%\"></td>";
					    }
					    trs +="</tr>";
					}
				    }
				    $("#tab_role").html("");
				    $("#tab_role").append(trs);
				    
				    //设置组件模版的选中
				    var homestuffs = res.homestuffs;
				    for(var i=0;i<homestuffs.length;i++){
					$("#form_plugtempsedit").find("input[type=checkbox][value='"+homestuffs[i].stufftype+"']").attr("checked","checked");
				    }
			    },'json');
			}
		    });
		    $("#win_plugtempsedit").window("open");
		} else {
		    message('请选择一行！');
		}
	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		var selected = $('#plugtemps').datagrid('getSelected');
		if (selected) {
		    confirm("确定删除该组件模版？",function(r){
			if(r){
			    $.get("crm/hometemplates/delete",{hometemplatesid:selected.hometemplatesid},function(res){
				if(res.type == true){
				    $('#plugtemps').datagrid('reload');
				}
			    },'json');
			}
		    });
		} else {
		    message('请选择一行！');
		}
	    }
	},{
	    text : '预览',
	    iconCls:'icon-view',
	    handler : function() {
		var selected = $('#plugtemps').datagrid('getSelected');
		if (selected) {
		    window.location.href = "crm/hometemplates/view?hometemplatesid="+selected.hometemplatesid+"&roleid="+selected.relRoleIds.split(',')[0];
		} else {
		    message('请选择一行！');
		}
	    }
	},{
	    text : '设置排序',
	    iconCls:'icon-tool',
	    handler : function() {
		var selected = $('#plugtemps').datagrid('getSelected');
		if (selected) {
		    $("#win_cfgorder").window({
			title:"设置组件排序",
			onOpen:function(){
			    //初始化tab
			    var cols = [ {
				field : 'stufftitle',
				title : '组件名称'
			    },{
				field : 'stuffsequence',
				title : '序列',
				editor:{type:'numberbox',options:{precision:0}}
			    }];
			    cols = setDefWidth(cols, 80);
			    $('#tab_templatestuff').datagrid({
				url:'crm/hometemplates/getStuff',
				collapsible : false,
				idField : 'stufftype',
				singleSelect : true,
				rownumbers : true,
				fitColumns:true,
				pagination : false,
				fit:true,
				border:false,
				queryParams:{hometemplatesid:selected.hometemplatesid},
				frozenColumns : [[{
					field : 'ck',
					checkbox : true
				}]],
				columns : [cols],
				onClickRow:function(rowIndex){
					if (lastIndex != rowIndex){
						$('#tab_templatestuff').datagrid('endEdit', lastIndex);
						$('#tab_templatestuff').datagrid('beginEdit', rowIndex);
					}
					lastIndex = rowIndex;
				}
			      });
			}
		    });
		    $("#win_cfgorder").window("open");
		} else {
		    message('请选择一行！');
		}		
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ]
    });
}
//设置模版组件排序
function cfgStuffOrder(){
    $('#tab_templatestuff').datagrid('endEdit', lastIndex);
   
    //得到改变的行，对改变的行进行处理。
    var changerows = $('#tab_templatestuff').datagrid('getChanges');
    
    $.post('crm/hometemplates/changeStuffOrder',{changerows:JSON.stringify(changerows)},function(res){
	if(res.type == true){
	    closeWin('win_cfgorder');
	}
    },'json');
}
function plugtempsSave(){
    $('#form_plugtempsedit').form('submit', {
	url : "crm/hometemplates/edit",
	onSubmit : function() {
            //验证
            if(!$('#form_customview').form("validate")){
        	return false;
            }
            //$("#form_plugtempsedit").find("input[name=stufftype]")
            //1获取选择项目，2获取角色信息
            var ck_stufftypes = $("#form_plugtempsedit").find("input[name=stufftype]:checked");
            if(ck_stufftypes.length<=0){
        	message("请选择组件！");
        	return false;
            }
            var stufftypes = [];
            for(var i=0;i<ck_stufftypes.length;i++){
        	stufftypes.push({stufftype:$(ck_stufftypes[i]).val(),stufftitle:$(ck_stufftypes[i]).closest("td").text().Trim()});
            }
            
            $("#form_plugtempsedit").find("input[name=templatesstuffs]").val(JSON.stringify(stufftypes));
            
            var ck_roleid = $("#form_plugtempsedit").find("input[name=roleid]:checked");
            if(ck_roleid.length<=0){
        	message("请选择角色！");
        	return false;
            }
            
	    return true;
	},
	success : function(data) {
	    var res = $.parseJSON(data);
	    if(res.type==true){
		closeWin('win_plugtempsedit');
		$('#plugtemps').datagrid('reload');
	    }
	}
    });  
}