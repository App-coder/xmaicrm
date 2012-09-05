$(function() {
    $('#tree_catalog').tree({
	method:'get',
	lines:true,
	onBeforeLoad:function(node,param){
	    if(node==null){
    		$('#tree_catalog').tree("options").url = 'catalog/getCatalogById?parentid=H1';
            }else if(node.id!=undefined){
        	$('#tree_catalog').tree("options").url = 'catalog/getCatalogById?parentid='+node.id;
            }
	}
    }); 
    
});