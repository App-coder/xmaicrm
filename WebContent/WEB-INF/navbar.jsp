<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 导航的基本链接 -->
<c:set var="home" value="<a href='welcome/homepage'>工作台</a>"></c:set>
<c:set var="marketing" value="<a href='customview/viewIndex?entitytype=Campaigns'>市场管理</a>"></c:set>
<c:set var="customer" value="<a href='customview/viewIndex?entitytype=Accounts'>客户</a>"></c:set>
<!-- 系统设置的链接 -->
<c:set var="syssetting" value="<a href='crm/setting/index' >系统设置</a>" ></c:set>
<c:choose>
	<c:when test="${pathname eq '营销活动' }">
		${marketing }&gt;<a href="${url }">营销活动</a>
	</c:when>
	<c:when test="${pathname=='添加营销活动'}">
		${marketing }&gt;<a href="${url }">添加营销活动</a>
	</c:when>
	<c:when test="${pathname=='编辑营销活动'}">
		${marketing }&gt;<a href="${url }">编辑营销活动</a>
	</c:when>
	<c:when test="${pathname=='系统用户' }">
		${syssetting }&gt;<a href="${url }">系统用户</a>
	</c:when>
	<c:when test="${pathname=='角色权限' }">
		${syssetting }&gt;<a href="${url }">角色权限</a>
	</c:when>
	<c:when test="${pathname=='添加角色'}">
		${syssetting }&gt;<a href="crm/settings/role/index">角色权限</a>&gt;<a href="${url }">添加角色</a>
	</c:when>
	<c:when test="${pathname=='编辑权限' }">
		${syssetting }&gt;<a href="crm/settings/role/index">角色权限</a>&gt;<a href="${url }">编辑权限：${pArgs }</a>
	</c:when>
	<c:when test="${pathname=='部门机构' }">
		${syssetting }&gt;<a href="${url }">部门机构</a>
	</c:when>
	<c:when test="${pathname=='全局共享规则' }">
		${syssetting }&gt;<a href="${url }">全局共享规则</a>
	</c:when>	
	<c:when test="${pathname=='显示区域' }">
		${syssetting }&gt;<a href="${url }">显示区域</a>
	</c:when>
	<c:when test="${pathname=='自定义字段' }">
		${syssetting }&gt;<a href="${url }">自定义字段</a>
	</c:when>
	<c:when test="${pathname=='下拉框选项' }">
		${syssetting }&gt;<a href="${url }">下拉框选项</a>
	</c:when>
	<c:when test="${pathname=='页面布局' }">
		${syssetting }&gt;<a href="${url }">页面布局</a>
	</c:when>
	<c:when test="${pathname=='系统日志' }">
		${syssetting }&gt;<a href="${url }">系统日志</a>
	</c:when>
	<c:when test="${pathname=='登入历史' }">
		${syssetting }&gt;<a href="${url }">登入历史</a>
	</c:when>	
	<c:when test="${pathname=='Email模版' }">
		${syssetting }&gt;<a href="${url }">Email模版</a>
	</c:when>
	<c:when test="${pathname=='编辑Email模版' }">
		${syssetting }&gt;<a href="crm/settings/emailtemplates/index">Email模版</a>&gt;<a href="${url }">编辑Email模版</a>
	</c:when>
	<c:when test="${pathname=='添加Email模版' }">
		${syssetting }&gt;<a href="crm/settings/emailtemplates/index">Email模版</a>&gt;<a href="${url }">添加Email模版</a>
	</c:when>
	<c:when test="${pathname=='Email模版预览' }">
		${syssetting }&gt;<a href="${url }">Email模版预览</a>
	</c:when>
	<c:when test="${pathname=='数据库备份' }">
		${syssetting }&gt;<a href="${url }">数据库备份</a>
	</c:when>
	<c:when test="${pathname=='公司信息管理 ' }">
		${syssetting }&gt;<a href="${url }">公司信息管理</a>
	</c:when>
	<c:when test="${pathname=='SMTP服务器 ' }">
		${syssetting }&gt;<a href="${url }">SMTP服务器</a>
	</c:when>
	<c:when test="${pathname=='货币币种' }">
		${syssetting }&gt;<a href="${url }">货币币种</a>
	</c:when>
	<c:when test="${pathname=='授权许可' }">
		${syssetting }&gt;<a href="${url }">授权许可</a>
	</c:when>	
	<c:when test="${pathname=='多仓库管理' }">
		${syssetting }&gt;<a href="${url }">多仓库管理</a>
	</c:when>
	<c:when test="${pathname=='主菜单' }">
		${syssetting }&gt;<a href="${url }">多仓库管理</a>
	</c:when>
	<c:when test="${pathname=='级联字段' }">
		${syssetting }&gt;<a href="${url }">级联字段</a>
	</c:when>
	<c:when test="${pathname=='相关信息模块字段' }">
		${syssetting }&gt;<a href="${url }">相关信息模块字段</a>
	</c:when>
	<c:when test="${pathname=='审批流程' }">
		${syssetting }&gt;<a href="${url }">审批流程</a>
	</c:when>
	<c:when test="${pathname=='编辑审批步骤' }">
		${syssetting }&gt;<a href="crm/settings/multiapprove/index">审批流程</a>&gt;<a href="${url }">编辑审批步骤</a>
	</c:when>
	<c:when test="${pathname=='新建审批步骤' }">
		${syssetting }&gt;<a href="crm/settings/multiapprove/index">审批流程</a>&gt;<a href="${url }">新建审批步骤</a>
	</c:when>
	<c:when test="${pathname=='自定义共享规则' }">
		${syssetting }&gt;<a href="${url }">自定义共享规则</a>
	</c:when>
	<c:when test="${pathname=='全局字段' }">
		${syssetting }&gt;<a href="${url }">全局字段</a>
	</c:when>
	<c:when test="${pathname=='相关信息' }">
		${syssetting }&gt;<a href="${url }">相关信息</a>
	</c:when>
	<c:when test="${pathname=='关联产品字段' }">
		${syssetting }&gt;<a href="${url }">关联产品字段</a>
	</c:when>
	<c:when test="${pathname=='短信通道' }">
		${syssetting }&gt;<a href="${url }">短信通道</a>
	</c:when>
	<c:when test="${pathname=='回收站' }">
		${syssetting }&gt;<a href="${url }">回收站</a>
	</c:when>		
	<c:when test="${pathname=='帐号&设置' }">
		<a href="${url }">帐号&设置</a>
	</c:when>
	<c:when test="${pathname=='组件模版预览' }">
		组件模版预览&gt;<a href="${url }">模版：${pArgs }</a>&gt;<a href="crm/module/home/index">返回工作台</a>
	</c:when>
	<c:otherwise>
		导航设置不正确！
	</c:otherwise>
</c:choose>	
