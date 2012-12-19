<div class="headerNav"  >
		<a class="logo"></a>
		<ul class="nav">
			<li><a href="javascript:msgWind()">手机短信</a></li>
			<li><a href="javascript:approveWind()">我的审批中心</a></li>
			<li><a href="javascript:remindWind()">自定义提醒</a></li>
			<li><a href="javascript:webmsgWind()">短消息</a></li>
			<li><a href="http://www.x-mai.com" target="_blank" >我要提问</a></li>
			<li><a href="crm/settings/users/detail">帐号&设置</a></li>
			<li><a href="crm/welcome/loginout">退出（${login.userName}）</a></li>
		</ul>
</div>	
<div id="nav_div">
	<ul id="nav">
		<#if login.isAdmin == 'on'>
			<#list menubar as menu>
				<li class="top" style="float: left;"><a class="top_link"><span class="down">${menu.parenttab.parenttabLabel}</span></a>
					<#if menu.tabs??>
					<ul class="sub">
						<#if menu.parenttab.parenttabid==11>
							<li><a href="crm/setting/index">${menu.parenttab.parenttabLabel}</a></li>
						</#if>
						<#if (menu.tabs?size>0)>
							<#list menu.tabs as tb>
								<#if tb??>
								<li><a href="crm/module/${tb.name?lower_case}/index?ptb=${menu.parenttab.parenttabid}">${tb.tablabel}</a></li>	
								</#if>
							</#list>
						</#if>
					</ul>
					</#if>
				</li>
			</#list>
		<#else>
			<#list menubar as menu>
				<#assign exist=false>
				<#if menu.tabs??>
				<#list menu.tabs as jd>
					<#if jd??>
						<#if permission.modulePermission[jd.tabid+'']??>
							<#assign exist=true>
						</#if>
					</#if>
				</#list>
				</#if>
				<#if exist==true>
					<li class="top" style="float: left;"><a class="top_link"><span class="down">${menu.parenttab.parenttabLabel}</span></a>
						<#if menu.tabs??>
							<#if (menu.tabs?size>0)>
								<ul class="sub">
									<#list menu.tabs as tb>
										<#if tb??>
											<#if permission.modulePermission[tb.tabid+'']??>
												<li><a href="crm/module/${tb.name}/index?ptb=${menu.parenttab.parenttabLabel}">${tb.tablabel}</a></li>
											</#if>
										</#if>
									</#list>
								</ul>
							</#if>
						</#if>
					</li>
				</#if>
			</#list>
		</#if>
	 	<li class="fr">
	 		<div class="searchuser">
	 			<form action="crm/search/query" method="post" >
	 			<input type="text" class="searchtext" name="searchuser"/><input class="button" type="submit" value="查找"/>
	 			</form>
	 		</div>
	 	</li>
	</ul>
</div>