<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>vtiger CRM 5 - Commercial Open Source CRM</title>
<style type="text/css">@import url("resources/style.css");</style>
<script language="JavaScript" type="text/javascript" src="include/js/popup.js"></script>
<script type="text/javascript" language="JavaScript">
function set_focus() {
	if (document.DetailView.user_name.value != '') {
		document.DetailView.user_password.focus();
		document.DetailView.user_password.select();
	}
	else document.DetailView.user_name.focus();
}
</script>
</head>
<body onload="set_focus()">
	<div class="loginContainer">
<table class="loginWrapper" width="100%" height="100%" cellpadding="10" cellspacing="0" border="0">
	<tr valign="top">
		<td valign="top" align="left" colspan="2">
			<img align="absmiddle" src="test/logo/vtiger-crm-logo.gif" alt="logo"/>
			<br />
			<a target="_blank" href="http://www.vtiger.com">vtiger</a>
			<br />
		</td>
	</tr>

	<tr>
		<td valign="top" align="center" width="50%">
			<div>
				<table border="0" cellspacing="0" cellpadding="10" class="small pluginsPromotionDiv">
					<tr>
						<td colspan="2" align="center" class="small">
							Get more out of vtiger CRM
						</td>
					</tr>
					<tr>
						<td width="50%" align="center" class=small>
							<a target="_blank" href="http://www.vtiger.com/crm/official-add-ons/#Outlook">
								<img align="absmiddle" border="0" src="include/images//OutlookPlugin.png" alt="Outlook Plugin">
							</a>
						</td>
						<td width="50%" align="center" class=small>
							<a target="_blank" href="http://www.vtiger.com/crm/official-add-ons/#Exchange">
								<img align="absmiddle" border="0" src="include/images//ExchangeConnector.png" alt="Exchange Connector">
							</a>
						</td>
					</tr>

					<tr>
						<td width="50%" align="center" class=small>
							<a target="_blank" href="http://itunes.apple.com/us/app/vtiger-crm-mobile/id381259792?mt=8">
								<img align="absmiddle" border="0" src="include/images//AppStoreQRCode.png" alt="vtiger iPhone Application">
								<br/>
								<img align="absmiddle" border="0" src="include/images//AppStore.png" alt="vtiger iPhone Application">
							</a>
						</td>
						<td width="50%" align="center" class=small>
							<a target="_blank" href="https://market.android.com/details?id=com.vtiger.apps.gvtigerpro&feature=search_result">
								<img align="absmiddle" border="0" src="include/images//GooglePlayQRCode.png" alt="vtiger Android Application">
								<br/>
								<img align="absmiddle" border="0" src="include/images//GooglePlay.png" alt="vtiger Android Application">
							</a>
						</td>
					</tr>
				</table>
			</div>
		</td>

		<td valign="top" align="center" width="50%">
			<div class="loginForm">
				<div class="poweredBy">Powered by vtiger CRM - 5.4.0</div>
				<form action="index.php" method="post" name="DetailView" id="form">
					<input type="hidden" name="module" value="Users" />
					<input type="hidden" name="action" value="Authenticate" />
					<input type="hidden" name="return_module" value="Users" />
					<input type="hidden" name="return_action" value="Login" />
					<div class="inputs">
						<div class="label">User Name</div>
						<div class="input"><input type="text" name="user_name"/></div>
						<br />
						<div class="label">Password</div>
						<div class="input"><input type="password" name="user_password"/></div>
												<br />
						<div class="button">
							<input type="submit" id="submitButton" value="Login" />
						</div>
					</div>
				</form>
			</div>
			<div class="importantLinks">
			<a href='javascript:mypopup()'>Read License</a>
			|
			<a href='http://www.vtiger.com/products/crm/privacy_policy.html' target='_blank'>Privacy Policy</a>
			|
			&copy; 2004- 2012			</div>
		</td>
	</tr>
	<tr valign="bottom">
		<td class="communityLinks">
			Connect with us
			<br />
			<a target="_blank" href="http://www.facebook.com/pages/vtiger/226866697333578?sk=app_143539149057867">
				<img align="absmiddle" border="0" src="include/images//Facebook.png" alt="Facebook">
			</a>
			<a target="_blank" href="http://twitter.com/#!/vtigercrm">
				<img align="absmiddle" border="0" src="include/images//Twitter.png" alt="Twitter">
			</a>
			<a target="_blank" href="http://www.linkedin.com/company/1270573?trk=tyah">
				<img align="absmiddle" border="0" src="include/images//Linkedin.png" alt="Linkedin">
			</a>
			<a target="_blank" href="http://www.youtube.com/user/vtigercrm">
				<img align="absmiddle" border="0" src="include/images//Youtube.png" alt="Videos">
			</a>
			<a target="_blank" href="http://wiki.vtiger.com/">
				<img align="absmiddle" border="0" src="include/images//Manuals.png" alt="Manuals">
			</a>
			<a target="_blank" href="http://forums.vtiger.com/">
				<img align="absmiddle" border="0" src="include/images//Forums.png" alt="Forums">
			</a>
			<a target="_blank" href="http://blogs.vtiger.com/">
				<img align="absmiddle" border="0" src="include/images//Blogs.png" alt="Blogs">
			</a>
		</td>
	</tr>
</table>

	</div>
</body>