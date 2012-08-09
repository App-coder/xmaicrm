var staffMonthly_columns=[[  
	   {field:'name',title:''},  
	   {field:'one',title:'一月'},{field:'two',title:'二月'},{field:'three',title:'三月'},  
	   {field:'four',title:'四月'},{field:'five',title:'五月'},{field:'six',title:'六月'},
	   {field:'seven',title:'七月'},{field:'eight',title:'八月'},{field:'nine',title:'九月'},  
	   {field:'ten',title:'十月'},{field:'eleven',title:'十一月'},{field:'twelve',title:'十二月'},
	   {field:'total',title:'合计'}
    ]];

$(function(){
	$('#staffMonthly').datagrid({
		url : 'integradedreports/salestotal/staffMonthly',
		doSize:true,
		collapsible : false,
		//idField : account_id,
		singleSelect : true,
		//queryParams:{entitytype:account_entitytype,viewid:account_viewid},
		columns : staffMonthly_columns,
		onLoadSuccess:function(data){
		    $('#staffMonthly').datagrid('fixColumnSize'); 
		}
    });
});
