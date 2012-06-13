$(function() {
    if(tab_viewid != -1){
	initView(1);
	initTab();
    }   
});
function initView(id){

  //设置视图
	$('#view_list_'+id).datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid,cangku:id},
		columns : [tab_columns],
		pageSize:20,
		toolbar : [{
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
			window.location.href="crm/module/campaigns/showedit?recordid=0&ptb="+ptb+"&module="+entitytype;
		    }
		}, {
		    text : '编辑',
		    iconCls:'icon-edit',
		    handler : function() {
			var selected = $('#view_list_'+id).datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}
		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
			var selected = $('#view_list_'+id).datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}			
		    }
		},{
		    text : '修改负责人',
		    iconCls:'icon-edit',
		    handler:function(){
			
		    }
		},{
		    text : '共享',
		    iconCls:'icon-share',
		    handler : function() {
			
		    }
		}],
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