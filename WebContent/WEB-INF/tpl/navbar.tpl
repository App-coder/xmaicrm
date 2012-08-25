<div class="headerNav"  >
		<a class="logo"></a>
		<ul class="nav">
			<li><a>手机短信</a></li>
			<li><a>我的审批中心</a></li>
			<li><a>自定义提醒</a></li>
			<li><a>我要提问</a></li>
			<li><a>帐号&设置</a></li>
			<li><a>退出（BOSS）</a></li>
		</ul>
</div>	
<div id="nav_div">
	<ul id="nav">
		<#if login.isAdmin == 'on'>
			<#list menubar as menu>
				<li class="top" style="float: left;"><a class="top_link"><span class="down">${menu.parenttab.parenttabLabel}</span></a>
					<#if menu.tabs??>
						<#if (menu.tabs?size>0)>
							<ul class="sub">
								<#list menu.tabs as tb>
									<#if tb??>
									<li><a>${tb.tablabel}</a></li>	
									</#if>
								</#list>
							</ul>
						</#if>
					</#if>
				</li>
			</#list>
		<#else>
		weewew
		</#if>
	</ul>
</div>