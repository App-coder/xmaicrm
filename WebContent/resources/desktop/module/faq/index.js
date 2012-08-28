$(function() {
    if(tab_viewid != -1){
	init();
    }   
});
function init(){

  //设置视图
	$('#view_list').datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		pageSize:20,
		toolbar : [{
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
			window.location.href="crm/module/products/showedit?recordid=0&ptb="+ptb+"&module="+entitytype;
		    }
		}, {
		    text : '编辑',
		    iconCls:'icon-edit',
		    handler : function() {
			var selected = $('#view_list').datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}
		    }
		},{
		    text : '批量修改',
		    iconCls:'icon-edit',
		    handler : function() {
			
		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
			var selected = $('#view_list').datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}			
		    }
		},{
		    text : '查找',
		    iconCls:'icon-search',
		    handler : function() {
			
		    }
		},{
		    text : '取消查找',
		    iconCls:'icon-undo',
		    handler : function() {
			
		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    if(data.footer!=undefined){
			$(".stat_div").empty();
			for(var i=0;i<data.footer.length;i++){
			    var stat = $(".div_statdemo").clone();
			    $(stat).find(".stat_name").html(data.footer[i].statname);
			    $(stat).find(".stat_num").html(data.footer[i].statnum);
			    $(".stat_div").append($(stat));
			}
			$(".stat_div").show();
		    }else{
			$(".stat_div").hide();
		    }
		}
	    });
	 initCatalog();
}

function initCatalog(){
    $('#catalog').tree({
	onClick: function(node){
	    var catalogid = node.attributes.catalogid;
	    $('#view_list').datagrid("options").queryParams.catalogid = catalogid;
	    $('#view_list').datagrid("reload");
	    
	}
    });
}

/*切换视图*/
function reloadView(val){
    
    $('#view_list').datagrid("loadData",[]);
    
    $.get('crm/customview/getDView',{cvid:val},function(res){
	setDefWidth(res,80);
	$('#view_list').datagrid({
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