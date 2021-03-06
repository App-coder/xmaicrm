var msg_ex = "系统出现异常，请联系管理员！";

$(function() {
    /*
	 $("body").ajaxStart(function(){ mask(); });
	  
	 $("body").ajaxStop(function(){ unmask(); });
	  
	 $(window).resize(function () {
            	 $('#tabs').tabs('resize');
         }); 
	  
	
	tabClose();
	tabCloseEven();
	*/
    //加载信息
});
function tab(title, url, closable) {
	if (closable == undefined) {
		closable = true;
	}
	var exists = $('#tabs').tabs('exists', title);

	if (!exists) {
		$('#tabs').tabs('add', {
			title : title,
			id : new Date().getTime(),
			closable : closable,
			href : url,
			cache : false,
			loadingMessage:'正在努力为您加载...',
//			content:"<iframe src="+url+" frameborder='0' width='100%'  height='100%' />",
			bodyCls : 'bstyle'
			//height : 100
		});
		
		tabClose();

	} else {
		$('#tabs').tabs("select", title);
	}

}
function g_select(domid, json, param, defopt) {
	var str = "";
	str += defopt;
	for ( var i = 0; i < json.length; i++) {
		str += "<option value=\"" + json[i][param.key] + "\">"
				+ json[i][param.value] + "</option>";
	}
	$("#" + domid).html(str);
}
function error(message) {
	$.messager.alert('错误提示', message, 'error');
}
function success(message) {
	$.messager.alert('提示', message, 'info');
}
function message(message) {
	$.messager.alert('提示', message, 'info');
}
function exception() {
	error('系统出现异常，请联系管理员！');
}
function rdnum() {
	return Math.floor(Math.random() * 100000);
}
function rdbytime() {
	return new Date().getTime();
}
function mask(msg) {
	if (msg) {
		$("body").mask(msg);
	} else {
		$("body").mask('页面正在加载……');
	}
}
function unmask() {
	$("body").unmask();
}

function loadMask(cs){
	$(cs).mask('页面正在加载……');
}

function unLoadMask(cs){
	$(cs).unmask();
}

function confirm(message, fun) {
	$.messager.confirm('提示信息', message, fun);
}

// kindeditor拓展
var editoritem_all = [ 'source', '|', 'undo', 'redo', '|', 'preview', 'print',
		'template', 'cut', 'copy', 'paste', 'plainpaste', 'wordpaste', '|',
		'justifyleft', 'justifycenter', 'justifyright', 'justifyfull',
		'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent',
		'subscript', 'superscript', 'clearhtml', 'quickformat', 'selectall',
		'|', 'fullscreen', '/', 'formatblock', 'fontname', 'fontsize', '|',
		'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
		'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'flash',
		'media', 'insertfile', 'table', 'hr', 'emoticons', 'map', 'code',
		'pagebreak', 'anchor', 'link', 'unlink' ];
var editoritem_default = [ 'source', '|', 'undo', 'redo', '|', 'justifyleft',
		'justifycenter', 'justifyright', 'justifyfull', 'insertorderedlist',
		'insertunorderedlist', 'indent', 'outdent', 'subscript', 'superscript',
		'clearhtml', 'selectall', '/', 'formatblock', 'fontname', 'fontsize',
		'|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
		'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'flash',
		'media', 'insertfile', 'table', 'emoticons', 'code', 'link', 'unlink' ];
var editoritem_more = [ 'source', '|', 'undo', 'redo', '|', 'preview', 'print',
		'template', 'cut', 'copy', 'paste', 'plainpaste', 'wordpaste', '|',
		'justifyleft', 'justifycenter', 'justifyright', 'justifyfull',
		'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent',
		'subscript', 'superscript', 'clearhtml', 'quickformat', 'selectall',
		'/', 'formatblock', 'fontname', 'fontsize', '|', 'forecolor',
		'hilitecolor', 'bold', 'italic', 'underline', 'strikethrough',
		'lineheight', 'removeformat', '|', 'image', 'flash', 'media',
		'insertfile', 'table', 'hr', 'emoticons', 'code', 'pagebreak',
		'anchor', 'link', 'unlink' ];
function closeWin(wind) {
	$('#' + wind).window('close');
}
function formsubmit(fid) {
	$('#' + fid).submit();
}
function clearform(fid){
    $('#' + fid).form("clear");
}
function reloadTab(){
    var currentTab = $('#tabs').tabs('getSelected');
    currentTab.panel('refresh');
}

function tabClose()
{
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children("span").text();
		$('#tabs').tabs('close',subtitle);
	})

	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY
		});
		
		var subtitle =$(this).children("span").text();
		$('#mm').data("currtab",subtitle);
		
		return false;
	});
}
//绑定右键菜单事件
function tabCloseEven()
{
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	})
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			$('#tabs').tabs('close',t);
		});	
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			if(t!=currtab_title)
				$('#tabs').tabs('close',t);
		});	
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			//msgShow('系统提示','后边没有啦~~','error');
			alert('后边没有啦~~');
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			alert('到头了，前边没有啦~~');
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});

	//退出
	$("#mm-exit").click(function(){
		$('#mm').menu('hide');
	})
}

function hideWind(id){
	$('#'+id).window('close');
}
/*判断数组是否重复*/
function mm(arr) {
	var hash = {};
	for (var i in arr) {
		if (hash[arr[i]]) {
			return true;
		}
		hash[arr[i]] = true;
	}
	return false;
}
function setDefWidth(cols,wid){
    for(var i=0;i<cols.length;i++){
	if(cols[i].width!="undefined"){
	    cols[i].width = wid;
	    cols[i].resizable = true;
	}
    }
    return cols;
}
//显示选项的optionwindow，用于选项的选择
function showOptionPanel(modulename,columnname,fieldlabel){
    $("#optionwindow").window({
	title:"选择"+fieldlabel,
	border:false,
	onClose:function(){
	    $("#optionframe").attr("src","");
	}
    });
    $("#optionframe").attr("src","crm/customview/viewPop?modulename="+modulename+"&columnname="+columnname+"&_rd="+rdnum());
    $("#optionwindow").window("open");
}
function showTip(value,row,index){
    return "<span title='"+value+"'>"+value+"</span>";
}

function showLocale(objD)
{
	var str;
	var yy = objD.getYear();
	if(yy<1900) yy = yy+1900;
	var MM = objD.getMonth()+1;
	if(MM<10) MM = '0' + MM;
	var dd = objD.getDate();
	if(dd<10) dd = '0' + dd;
	var hh = objD.getHours();
	if(hh<10) hh = '0' + hh;
	var mm = objD.getMinutes();
	if(mm<10) mm = '0' + mm;
	var ss = objD.getSeconds();
	if(ss<10) ss = '0' + ss;
	str = yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + ":" + ss;
    return(str);
}

function initEdit(name,module,resizeType){
	var editor = KindEditor.create('textarea[name="'+name+'"]', {
		resizeType : 1,
		allowPreviewEmoticons : true,
		allowImageUpload : true,
		allowFileManager : true,
		resizeType:resizeType,
		//urlType:'absolute',
		items:editoritem_more,
		uploadJson:'crm/file/upload',
		fileManagerJson:'crm/file/filemanager',
		fileloc:"attach/"+module+"/",
		pluginsPath:"resources/plugins/kindeditor/plugins/"
	});
	return editor;
}
//去除空格,回车
String.prototype.Trim = function()
{
	return this.replace(/(^\s*)|(\s*$)|(\n)/g, ""); 
}

//删除字符串左边的空格回车
String.prototype.LTrim = function()
{
	return this.replace(/(^\s*)|(^\n)/g, ""); 
}

String.prototype.RTrim = function()
{
	return this.replace(/(\s*$)|(\n$)/g, ""); 
}