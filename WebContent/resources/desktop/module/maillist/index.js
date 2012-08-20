$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'maillistname',
	title : '方案名称'
    }, {
	field : 'description',
	title : '备注'
    },{
	field : 'maillisttitle',
	title : '邮件主题'
    },{
	field : 'sentcount',
	title : '已发数量'
    },{
	field : 'unsentcount',
	title : '未发数量'
    },{
	field : 'allcount',
	title : '总数量',
	formatter:function(value,row,index){
	    return Number(row.sentcount)+Number(row.unsentcount);
	}
    } ];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid({
	url:'crm/module/maillists/list',
	collapsible : false,
	idField : 'maillistid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	toolbar : [{
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}