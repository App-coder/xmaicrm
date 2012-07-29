<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="http://localhost:8080/xmaicrm/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${webtitle}</title>
<link href="resources/login/css/login.css" rel="stylesheet" type="text/css" />
<script language="JavaScript">
function fleshVerify(){ 
	$('#verifyImg').attr('src', '/kaptcha.jpg?' + Math.floor(Math.random()*100) ); 
}
</script>
</head>
<body>
<div class="logobanner" style="height:150px;">
	<image src="resources/login/images/hbg.png" height="150px;" width="100%;"/>
</div>
<div id="login">
    <div id="login_content">
    <div class="loginForm">
            	<form method="post" action="admin/webmaster/login" >
				<p>
					<input type="text" name="user_name" autocomplete="false" size="20" class="login_input" />
				</p>
				<p>
					<input type="password" name="password" autocomplete="false" size="20" class="login_input" />
				</p>
				<p>
					<input type="text" name="verify" width="75px;" autocomplete="false" size="20" class="login_input" />
				</p>
				<p>
				<input class="login_btn sub" type="submit" name="form_submit"   value=" " />
				</p>
			</form>
		</div>
    </div>
    <div style="text-align: center;margin-bottom: 20px;color:#C2C2C2;">
		Copyright©2012. www.x-mai.com.        新麦软件工作室 All rights reserved.
		</div>
</div>

</body>
</html>