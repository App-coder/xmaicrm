var cangkuinfo_columns=[[  
	   {field:'cangkuname',title:'仓库',width:100,align:'right'},  
	   {field:'prodcount',title:'种类',width:100,align:'right'},
	   {field:'cangkucount',title:'库存数',width:100,align:'right'},
	   {field:'assets',title:'资产',width:100,align:'right'}
    ]];

$('#cangkuinfo').datagrid({
		url : 'integradedreports/cangkuinfo',
		doSize:true,
		collapsible : false,
		singleSelect : true,
		showFooter:true,
		columns : cangkuinfo_columns,
		onLoadSuccess:function(data){
		    $('#cangkuinfo').datagrid('fixColumnSize'); 
		}
});