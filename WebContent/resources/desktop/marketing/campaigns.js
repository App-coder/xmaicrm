//定义页面变量，需要前缀，防止多页面变量重复
var campaign_entitytype = 'Campaigns';
var campaign_id = 'campaignid';

$(function() {
    	
    if(campaign_viewid != -1){
	init();
    }
    
    	
    
});
function init(){
  //设置视图
	$('#campaign_list').datagrid({
		url : 'campaign/renderView',
		doSize:true,
		collapsible : false,
		idField : campaign_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:campaign_entitytype,viewid:campaign_viewid},
		columns : [campaign_columns],
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]]
	    });
}