$(function(){
    initSearch();
});
function initSearch(){
    var basicsearch = "";
    if(tab_columns.length>0){
	for(var i=0;i<tab_columns.length;i++){
	    basicsearch +="<option value=\""+tab_columns[i].title+"\">"+tab_columns[i].title+"</option>";
	}
    }
    $("select[name=basicsearchfield]").html(basicsearch);
}
function basicSearch(){
    
}
function advSearch(){
    $("#wind_advSearch").window("open");
}
function cacelSearch(){
    
}
function advSearchDo(){
    
}
