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
					<ul class="sub">
						<#if menu.parenttab.parenttabid==11>
							<li><a href="crm/setting/index">${menu.parenttab.parenttabLabel}</a></li>
						</#if>
						<#if (menu.tabs?size>0)>
							<#list menu.tabs as tb>
								<#if tb??>
								<li><a href="crm/customview/viewIndex?entitytype=${tb.name}&ptb=${menu.parenttab.parenttabLabel}">${tb.tablabel}</a></li>	
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
												<li><a href="crm/customview/viewIndex?entitytype=${tb.name}&ptb=${menu.parenttab.parenttabLabel}">${tb.tablabel}</a></li>
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
	</ul>
</div>