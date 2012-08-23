$(function(){
    initForm();
    initPage();
});
function initForm(){
    $('#form_group').form({
	url : 'settings/group/groupEdit',
	onSubmit : function() {
	    if ($('#form_group').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('groupedit');
	       $('#form_group').form("clear");
	       $(".validatebox-tip").hide();
	       $('#grouplist').datagrid("reload");
	   }
	}
    });
}
function initPage(){
    
    var cols = [ {
	    field : 'groupname',
	    title : '部门名称'
	},{
	    field : 'description',
	    title : '描述'
	}];
    cols = setDefWidth(cols,80);
    
    $('#grouplist').datagrid({
	url : 'settings/group/listAll',
	collapsible : false,
	idField : 'groupid',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	height : 362,
	toolbar : [ {
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		$("#form_group").find("input[name=action]").val("add");
		$("#groupedit").window({
		    title:'部门添加',
		    onClose:function(){
			$("#form_group").form("clear");
			$(".validatebox-tip").hide();
		    }
		});
		$("#groupedit").window("open");
	    }
	},{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
		var selected = $('#grouplist').datagrid("getSelected");
		if (selected) {
		    $("#form_group").find("input[name=action]").val("update");
		    loadForm(selected.groupid);
		    $("#groupedit").window({
			    title:'部门编辑',
			    onClose:function(){
				$("#form_group").form("clear");
				$(".validatebox-tip").hide();
			    }
		    });
		    $("#groupedit").window("open");
		} else {
		    message("请选择一行记录！");
		}
	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
		var selected = $('#grouplist').datagrid("getSelected");
		if (selected) {
		    confirm('确定删除部门？',function(r){
			if(r){
			    $.post('settings/group/delete',{groupid:selected.groupid},function(res){
				if(res.type==true){
				    $('#grouplist').datagrid("reload");
				}
			    },'json');			    
			}
		    });
		}else {
		    message("请选择一行记录！");
		}
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}
function loadForm(groupid){
    
    $.post('settings/group/getGroupById',{groupid:groupid},function(res){
	$("#form_group").form("load",res);
    },'json');
    
}