$(function() {
    initView(0);
    initTab();
});
function initView(id){
    
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
	title : '库存数量 '
    },{
	field : '6',
	title : '库存价值'
    },{
	field : '7',
	title : '锁定数量'
    },{
	field : '8',
	title : '在途数量 '
    },{
	field : '9',
	title : '备注'
    }];
   cols = setDefWidth(cols, 80);
  //设置视图
	$('#view_list_'+id).datagrid({
		url : '',
		collapsible : false,
		idField : "",
		rownumbers : true,
		pagination:true,
		queryParams:{cangku:id},
		columns : [cols],
		pageSize:20,
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		toolbar : [{
		    text : '导出库存余额',
		    iconCls:'icon-excel',
		    handler : function() {
			
		    }
		}, {
		    text : '创建进货单   ',
		    iconCls:'icon-add',
		    handler : function() {
			
		    }
		},{
		    text : '更新锁定、在途数量',
		    iconCls:'icon-lock',
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
	    initView(tabid);
	}
    }

    
    //初始化tab_cangkus的onchange事件处理
    $('#tab_cangkus').tabs({
	onSelect: function(title,index){
	   if(title!="全部仓库"){
	       
	       var tab = $("#tab_cangkus").tabs("getTab",title);
	       var tabid = $(tab).find(".viewlist").attr("id");
	       tabid = tabid.replace("view_list_","");
	       
	       initView(tabid);
	       
	   }else{
	       initView(0);
	   }
	}
    });
    
    
}
/*切换视图*/
function reloadView(val,id){
    
    $('#view_list_'+id).datagrid("loadData",[]);
    
    $.get('crm/customview/getDView',{cvid:val},function(res){
	setDefWidth(res,80);
	$('#view_list_'+id).datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:val},
		columns : [res],
		pageSize:20
	});
    },'json');
    
    
}