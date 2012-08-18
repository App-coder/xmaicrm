<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script>
var spath = '<%=request.getContextPath()%>';
var loc = window.location.href;
var url = loc.substring(loc.indexOf(spath)+spath.length+1);
$(function(){
    $.post('welcome/navbar',{url:url},function(html){
		$("#navpath").html(html);	
    },'html');
});
</script>