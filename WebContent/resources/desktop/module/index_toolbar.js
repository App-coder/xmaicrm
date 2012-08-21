$(function(){
    init_toolbar();
});

function init_toolbar(){
    init_cbtScope();
}

function init_cbtScope(){
    $('#cbt_scope').combotree({
	onClick:function(node){
	    $('#view_list').datagrid("options").queryParams.scope = node.id;
	    $('#view_list').datagrid("reload");
	}
    });
}

function insert(){
    window.location.href="crm/module/"+entitytype.toLowerCase()+"/showedit?recordid=0&ptb="+ptb+"&module="+entitytype;
}

function edit(){
    var selected = $('#view_list').datagrid("getSelected");
    if (selected) {
	window.location.href = "crm/module/"+entitytype.toLowerCase()+"/showedit?recordid="
		+ selected[$('#view_list').datagrid("options").idField] + "&ptb=" + ptb + "&module=" + entitytype;
    } else {
	message("请选择记录！");
    }
}