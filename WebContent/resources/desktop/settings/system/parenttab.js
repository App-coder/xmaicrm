$(function(){
    initPage();
    initForm();
});
function initForm(){
    $('#form_parenttab').form({
	url : 'crm/settings/parenttab/edit',
	onSubmit : function() {
	    if ($('#form_parenttab').form("validate")) {
		setTabRel();
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('parenttabedit');
	       $('#form_parenttab').form("clear");
	       $(".validatebox-tip").hide();
	       $('#parenttab_list').datagrid("reload");
	   }
	}
    });
    
}
function initPage(){
    var cols = [ {
	field : 'parenttabLabel',
	title : '主菜单'
    }, {
	field : 'sequence',
	title : '显示顺序'
    }];
    cols = setDefWidth(cols, 80);
    $('#parenttab_list').datagrid({
	url : 'crm/settings/parenttab/list',
	collapsible : false,
	idField : 'parenttabid',
	singleSelect : true,
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#parenttabedit").window({
		    title:"添加主菜单"
		});
		initAddWind();
		$("#parenttabedit").window({
		    onClose:function(){
			$("#form_parenttab").form("clear");
			$(".validatebox-tip").hide();
			
			$('#allmodule').datagrid("clearSelections");
			$('#viewmodule').datagrid("clearSelections");
			
		    }
		});
		$("#parenttabedit").window("open");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#parenttab_list').datagrid("getSelected");
		if (selected) {
		    initEditWind(selected.parenttabid);
		    $("#parenttabedit").window({
			title:'修改主菜单',
			onClose:function(){
			    $("#form_parenttab").form("clear");
			    $(".validatebox-tip").hide();
			    
			    $('#allmodule').datagrid("clearSelections");
			    $('#viewmodule').datagrid("clearSelections");
			    
			}
		    });
		    $("#parenttabedit").window("open");
		} else {
		    message("请选择一行记录！");
		}
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#parenttab_list').datagrid("getSelected");
		if (selected) {
		    confirm('确认删除主菜单？',function(r){
			if(r){
			    $.post('crm/settings/parenttab/delete',{parenttabid:selected.parenttabid},function(res){
				if(res.type == true){
				    $('#parenttab_list').datagrid("reload");
				}
			    },'json');
			}
		    });
		} else {
		    message("请选择一行记录！");
		}		
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
    
    
    
    var cols = [ {
	field : 'tablabel',
	title : '模块名称'
    }];
    cols = setDefWidth(cols, 80);
    $('#allmodule').datagrid({
	title:'所有模块',
	collapsible : false,
	idField : 'tabid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	height:357,
	toolbar : [ {
	    iconCls : 'icon-left',
	    handler : function() {
		var selected = $('#allmodule').datagrid("getSelections");
		
		if (selected) {
		    for(var i=0;i<selected.length;i++){
			
			//判断是否存在
			var exist = isExist(selected[i]);
			if(!exist){
			    $('#viewmodule').datagrid("appendRow",selected[i]);
			}
			
		    }
		} else {
		    message("请选择一行记录！");
		}		
	    }
	}],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
    
    var cols = [ {
	field : 'tablabel',
	title : '模块名称'
    }];
    cols = setDefWidth(cols, 80);
    $('#viewmodule').datagrid({
	title:'显示模块',
	collapsible : false,
	idField : 'tabid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect:true,
	height:357,
	toolbar : [ {
	    title:'删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#viewmodule').datagrid("getSelected");
		var viewall = $('#viewmodule').datagrid("getRows");
		if (selected) {
		    var newdata = [];
		    for(var i=0;i<viewall.length;i++){
			if(selected.tabid!=viewall[i].tabid){
			    newdata.push({
				tabid:viewall[i].tabid,
				tablabel:viewall[i].tablabel
			    });
			}
		    }
		    
		    $('#viewmodule').datagrid("loadData",newdata);
		    
		}else {
		    message("请选择一行记录！");
		}
	    }
	},{
	    iconCls : 'icon-up',
	    handler : function() {
		var selected = $('#viewmodule').datagrid("getSelected");
		var viewall = $('#viewmodule').datagrid("getRows");
		if (selected) {
		    var cindex = $('#viewmodule').datagrid("getRowIndex",selected);
		    
		    if(cindex > 0 && $('#viewmodule').datagrid("getRows").length>2){
			//viewall[cindex - 1]
			var pfix = {
				tabid:viewall[cindex - 1].tabid,
				tablabel:viewall[cindex - 1].tablabel
			};
			//上移操作
			$('#viewmodule').datagrid('updateRow',{
				index: cindex - 1,	
				row:selected
			});
			
			$('#viewmodule').datagrid('updateRow',{
				index: cindex ,	
				row:pfix
			});
			
			$('#viewmodule').datagrid("selectRow",cindex - 1);
			
		    }
		    
		} else {
		    message("请选择一行记录！");
		}
	    }
	},{
	    iconCls : 'icon-down',
	    handler : function() {
		
		var selected = $('#viewmodule').datagrid("getSelected");
		var viewall = $('#viewmodule').datagrid("getRows");
		
		if (selected) {
		    
		    var cindex = $('#viewmodule').datagrid("getRowIndex",selected);
		    
		    if(cindex<$('#viewmodule').datagrid("getRows").length-1 && $('#viewmodule').datagrid("getRows").length>1){
			var nxt = {
				tabid:viewall[cindex + 1].tabid,
				tablabel:viewall[cindex + 1].tablabel	
			};
			
			$('#viewmodule').datagrid('updateRow',{
				index: cindex + 1,	
				row:selected
			});
			
			$('#viewmodule').datagrid('updateRow',{
				index: cindex ,	
				row:nxt
			});
			
			$('#viewmodule').datagrid("selectRow",cindex + 1);
			
		    }
		    
		    
		} else {
		    message("请选择一行记录！");
		}		
	    }
	}],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });  
}
//初始化添加窗口
function initAddWind(){
    $('#allmodule').datagrid("options").url = 'crm/settings/parenttab/parenttabList';
    $('#allmodule').datagrid("reload");
    
    $('#viewmodule').datagrid("loadData",[]);
}
function initEditWind(parenttabid){
    
    $.post('crm/settings/parenttab/getParenttab',{id:parenttabid},function(res){
	$("#form_parenttab").form("load",res);
    },'json');
    
    //得到已经选择的module
    $('#viewmodule').datagrid("options").url = 'crm/settings/parenttab/existParenttabList?parenttabid='+parenttabid;
    $('#viewmodule').datagrid("reload");
    
    //显示没有选择的隐藏的module
    $('#allmodule').datagrid("options").url = 'crm/settings/parenttab/parenttabList';
    $('#allmodule').datagrid("reload");
    
}
function isExist(select){
    var selected = $('#viewmodule').datagrid("getRows");
    var exist = false;
    for(var i=0;i<selected.length;i++){
	if(select.tabid == selected[i].tabid ){
	    exist = true;
	    break;
	}
    }
    return exist;
}
//设置tabrel的jsonarray对象
function setTabRel(){
    var allrows = $('#viewmodule').datagrid("getRows");
    var tabrels = [];
    for(var i=0;i<allrows.length;i++){
	tabrels.push({
	    tabid:allrows[i].tabid,
	    sequence:i
	});
    }
    $("#form_parenttab").find("input[name=tabrel]").val(new JSONUtil().stringify(tabrels));
}