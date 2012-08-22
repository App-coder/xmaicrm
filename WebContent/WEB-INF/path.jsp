<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script>
$(function(){
    var _spath = '<%=request.getContextPath()%>';
    var _loc = window.location.href;
    var _url = _loc.substring(_loc.indexOf(_spath)+_spath.length+1);
    $.post('crm/welcome/navbar',{pathname:pathname,url:_url},function(html){
		$("#navpath").html(html);	
    },'html');
});
</script>