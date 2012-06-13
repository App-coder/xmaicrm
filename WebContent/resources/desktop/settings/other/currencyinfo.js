$(function() {
    initForm();
    initPage();
});
function initForm(){
    
    $('#form_currencyinfo').form({
	url : 'crm/settings/currencyInfo/edit',
	onSubmit : function() {
	    if ($('#form_currencyinfo').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('currencyinfo');
	       $('#form_currencyinfo').form("clear");
	       $('#form_currencyinfo').find("input[name=defaultid]").val(0);
	       $(".validatebox-tip").hide();
	       $('#currencyinfo_list').datagrid("reload");
	   }
	}
    });
    
}
function initPage() {

    var cols = [ {
	field : 'currencyName',
	title : '货币名称'
    }, {
	field : 'currencyCode',
	title : '货币编码'
    },{
	field : 'currencySymbol',
	title : '货币标识'
    },{
	field : 'conversionRate',
	title : '汇率'
    },{
	field : 'currencyStatus',
	title : '状态'
    } ];
    cols = setDefWidth(cols, 80);

    $('#currencyinfo_list').datagrid({
	url : 'crm/settings/currencyInfo/list',
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	fitColumns : true,
	method:'GET',
	height : 362,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#currencyinfo").window({
		    title:'添加货币币种',
		    onClose:function(){
			$(".validatebox-tip").hide();
		    }
		});
		$("#currencyinfo").window("open");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#currencyinfo_list').datagrid("getSelected");
		if (selected) {
		    loadForm(selected.id);
		}else{
		    message("请选择一行记录！");
		}
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#currencyinfo_list').datagrid("getSelected");
		if (selected) {
		    if(Number(selected.defaultid) >= 0){
			confim('确定删除货币币种？',function(r){
			    if(r){
				$.post('crm/settings/currencyInfo/delete',{cid:selected.id},function(res){
				    if(res.type == true){
					$('#currencyinfo_list').datagrid("reload");
				    }
				},'json');
			    }
			});
		    }else{
			message("该货币类型为保留项！");
		    }
		}else{
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
}
function loadForm(cid){
    $.post('crm/settings/currencyInfo/getCurrencyById',{cid:cid},function(res){
	$('#form_currencyinfo').form("load",res);
	$("#currencyinfo").window("open");
    },'json');
}