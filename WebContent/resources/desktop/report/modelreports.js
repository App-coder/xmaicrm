
$('#modelreports').datagrid({
		url : 'integradedreports/modelreports/'+id+'/'+duedate+'',
		title:column_name[id-4],
		doSize:true,
		collapsible : false,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		columns : reports[id-4].columns,
		onLoadSuccess:function(data){
		    $('#modelreports').datagrid('fixColumnSize'); 
		}
});