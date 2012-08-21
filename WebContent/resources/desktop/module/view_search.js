var searchtype = "basic";

var typeofdata = new Array();
typeofdata['V'] = ['e','n','s','c','k'];
typeofdata['N'] = ['e','n','l','g','m','h'];
typeofdata['T'] = ['e','n','l','g','m','h'];
typeofdata['I'] = ['e','n','l','g','m','h'];
typeofdata['C'] = ['e','n'];
typeofdata['D'] = ['e','n','l','g','m','h'];

$(function(){
    initSearch();
});
function initSearch(){
    var basicsearch = "";
    if(tab_columns.length>0){
	for(var i=0;i<tab_columns.length;i++){
	    basicsearch +="<option value=\""+tab_columns[i].field+"\">"+tab_columns[i].title+"</option>";
	}
    }
    $("select[name=basicsearchfield]").html(basicsearch);
}
function basicSearch(){
    var basicsearchfield = $("select[name=basicsearchfield]").val();
    var basicsearchvalue = $("input[name=basicsearchvalue]").val();
    
    $('#view_list').datagrid("options").queryParams.basicsearchfield = basicsearchfield;
    $('#view_list').datagrid("options").queryParams.basicsearchvalue = basicsearchvalue;
    $('#view_list').datagrid("options").queryParams.searchtype = searchtype;
    $('#view_list').datagrid("reload");
    
}
function addCollection(){
    $("#tab_advfilter").find("tr:last").after($("<tr>"+$(".advCol").find("tr").html()+"</tr>"));
}
function advSearch(){
    $("#wind_advSearch").window("open");
}
function cacelSearch(){
    $("input[name=basicsearchvalue]").val("");
    $('#view_list').datagrid("options").queryParams.basicsearchfield = "";
    $('#view_list').datagrid("options").queryParams.basicsearchvalue = "";
    $('#view_list').datagrid("options").queryParams.searchtype = "";
    $('#view_list').datagrid("options").queryParams.page = 1;
    
    $('#view_list').datagrid("options").queryParams.searchtype = "";
    $('#view_list').datagrid("options").queryParams.advfilters = "";
    $('#view_list').datagrid("options").queryParams.matchMeth = "";
    $("#tab_advfilter").find("tr:not(:first)").remove();
    $("#tab_advfilter").find("tr").find("select[name=field]").val("");
    $("#tab_advfilter").find("tr").find("select[name=reg]").val("");
    $("#tab_advfilter").find("tr").find("input[name=fval]").val("");
    $("input[name=matchMeth]:first").attr("checked",true);
    
    
    $('#view_list').datagrid("reload");
}
function advSearchDo(){
    searchtype = "adv";
    $('#view_list').datagrid("options").queryParams.searchtype = searchtype;
    
    var matchMeth = $("input[name=matchMeth]:checked").val();
    
    var advfilters = [];
    //高级查找条件
    var filter_trs = $("#tab_advfilter").find("tr");
    if(filter_trs.length>0){
	for(var i=0;i<filter_trs.length;i++){
	    
	    var field = $(filter_trs[i]).find("select[name=field]").val();
	    var reg = $(filter_trs[i]).find("select[name=reg]").val();
	    var fval = $(filter_trs[i]).find("input[name=fval]").val();
	    
	    if(typeof(field)!=undefined&&typeof(reg)!=undefined&&typeof(fval)!=undefined){
		var obj = JSON.parse(field);
		obj.reg = reg;
		obj.value = fval;
		advfilters.push(obj);
	    }
	}
    }
    $('#view_list').datagrid("options").queryParams.advfilters = JSON.stringify(advfilters);
    $('#view_list').datagrid("options").queryParams.matchMeth = matchMeth;
    $("#wind_advSearch").window("close");
    $('#view_list').datagrid("reload");
}
function removeThis(tr){
    $(tr).closest("tr").remove();
}
function setComp(val,obj){
    var fcol = $.parseJSON(val);
    var tp = fcol.fieldtypeofdata.substring(0,1);

    var soptions = typeofdata[tp];
    var opstr = "<option value=\"\">无</option>";
    for(var i=0;i<soptions.length;i++){
	var v = "";
	if(soptions[i]=="e"){
	    v = "等于";
	}else if(soptions[i]=="n"){
	    v = "不等于";
	}else if(soptions[i]=="s"){
	    v = "开始为";
	}else if(soptions[i]=="c"){
	    v = "包含";
	}else if(soptions[i]=="k"){
	    v = "不包含";
	}else if(soptions[i]=="l"){
	    v = "小于";
	}else if(soptions[i]=="g"){
	    v = "大于";
	}else if(soptions[i]=="m"){
	    v = "小于等于";
	}else if(soptions[i]=="h"){
	    v = "大于等于";
	}
	opstr +="<option value=\""+soptions[i]+"\">"+v+"</option>";
    }
    $(obj).closest("tr").find("select[name=reg]").html(opstr);
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