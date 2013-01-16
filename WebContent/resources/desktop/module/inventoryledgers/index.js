$(function() {
    initView(0);
    initTab();
});
function initView(id){
    
    var cols = [ {
	field : '1',
	title : '仓库'
    }, {
	field : '2',
	title : '产品名称'
    },{
	field : '3',
	title : '产品编码'
    },{
	field : '4',
	title : '产品型号'
    },{
	field : '5',
	title : '产品类别'
    },{
	field : '6',
	title : '期初数量'
    },{
	field : '7',
	title : '期初金额'
    },{
	field : '8',
	title : '期间入库'
    },{
	field : '9',
	title : '入库金额'
    },{
	field : '10',
	title : '期间出库'
    },{
	field : '11',
	title : '出库金额'
    },{
	field : '12',
	title : '期末数量'
    },{
	field : '13',
	title : '期末金额'
    }];
    cols = setDefWidth(cols, 80);

  //设置视图
	$('#view_list_'+id).datagrid({
		url : '',
		collapsible : false,
		idField : '',
		rownumbers : true,
		pagination:true,
		queryParams:{cangku:id},
		columns : [cols],
		pageSize:20,
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    if(data.footer!=undefined){
			$(".stat_div_"+id).empty();
			for(var i=0;i<data.footer.length;i++){
			    var stat = $(".div_statdemo").clone();
			    $(stat).find(".stat_name").html(data.footer[i].statname);
			    $(stat).find(".stat_num").html(data.footer[i].statnum);
			    $(".stat_div_"+id).append($(stat));
			}
			$(".stat_div_"+id).show();
		    }else{
			$(".stat_div_"+id).hide();
		    }
		}
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
	       initView(1);
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