$(function(){
    initTab();
});
function initList(cangkuid){
    
    var cols = [{
	field : '1',
	title : '产品名称'
    },{
	field : '2',
	title : '产品编号'
    },{
	field : '3',
	title : '型号'
    },{
	field : '4',
	title : '单价'
    },{
	field : '5',
	title : '初始化产品数量 '
    }];
   cols = setDefWidth(cols, 80);
    
   $('#view_list_'+cangkuid).datagrid({
	url : '',
	collapsible : false,
	idField : "",
	rownumbers : true,
	pagination:true,
	queryParams:{cangku:cangkuid},
	columns : [cols],
	pageSize:20,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	toolbar : [{
	    text : '保存',
	    iconCls:'icon-save',
	    handler : function() {
		
	    }
	},{
	    text : '取消',
	    iconCls:'icon-cancel',
	    handler : function() {
		
	    }
	}]
   });
}
function initTab(){
    
    var tabs = $("#tab_cangkus").tabs("tabs");
    if(tabs.length>1){
	for(var i=0;i<tabs.length;i++){
	    var tabid = $(tabs[i]).find(".viewlist").attr("id");
	    initList(tabid);
	}
    }

    
    //初始化tab_cangkus的onchange事件处理
    $('#tab_cangkus').tabs({
	onSelect: function(title,index){
	       var tab = $("#tab_cangkus").tabs("getTab",title);
	       var tabid = $(tab).find(".viewlist").attr("id");
	       tabid = tabid.replace("view_list_","");
	       initList(tabid);
	}
    });
    
    
}