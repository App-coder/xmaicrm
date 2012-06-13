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

function obj2str(o) {
	var r = [];
	if (typeof o == "string")
		return "\""
				+ o.replace(/([\'\"\\])/g, "\\$1").replace(/(\n)/g, "\\n")
						.replace(/(\r)/g, "\\r").replace(/(\t)/g, "\\t") + "\"";
	if (typeof o == "object") {
		if (!o.sort) {
			for ( var i in o)
				r.push(i + ":" + obj2str(o[i]));
			if (!!document.all
					&& !/^\n?function\s*toString\(\)\s*\{\n?\s*\[native code\]\n?\s*\}\n?\s*$/
							.test(o.toString)) {
				r.push("toString:" + o.toString.toString());
			}
			r = "{" + r.join() + "}"
		} else {
			for ( var i = 0; i < o.length; i++)
				r.push(obj2str(o[i]))
			r = "[" + r.join() + "]"
		}
		return r;
	}
	return o.toString();
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
