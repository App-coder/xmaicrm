$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
    	    field : 'userName',
    	    title : '用户名'
    	},{
    	    field : 'userIp',
    	    title : '用户IP'
    	},{
    	    field : 'loginTime',
    	    title : '登录时间'
    	},{
    	    field : 'logoutTime',
    	    title : '退出时间'
    	},{
    	    field : 'status',
    	    title : '状态'
    	}];
    cols = setDefWidth(cols,80);
    
    $('#relmodfield').datagrid({
    	collapsible : false,
    	singleSelect : true,
    	rownumbers : true,
    	pagination:true,
    	fitColumns:true,
    	queryParams:{},
    	height:359,
    	frozenColumns : [[{
    		field : 'ck',
    		checkbox : true
    	}]],
    	columns : [ cols ],
    });    
    $("#selectuser").val("");
}
function reloadGrid(username){
    
    if(isempty(username)){
	return;
    }
    
    $('#loginlist').datagrid("options").url = "settings/loginhistory/loadHistory";
    $('#loginlist').datagrid("options").queryParams = {username:username};
    $('#loginlist').datagrid("getPager").pageNumber = 1;
    $('#loginlist').datagrid("reload");
    
}