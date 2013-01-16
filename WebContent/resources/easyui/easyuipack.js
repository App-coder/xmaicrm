function dateboxformatter() {
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    var d = date.getDate();
    return y+"-"+m+"-"+d;
}
function datetimeboxFormatter(){
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    var d = date.getDate();
    var h = date.getHours();
    var mi = date.getMinutes();
    var se = date.getSeconds();
    return y+"-"+m+"-"+d+" "+h+":"+mi+":"+se;
}
//cbotree设置目录不可选
function bind_cbo_onBeforeSelect(cboid){
    $('#'+cboid).combotree({
	onBeforeSelect:function(node){
	    if(node.iconCls == 'icon-group'){
		return false;
	    }
	}
    });
}