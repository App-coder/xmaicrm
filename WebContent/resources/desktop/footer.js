function loadMsg(){
	$.messager.show({
		title:'系统提示',
		msg:'你有四条短信息。【详细…】<span id=\'tipmsg\'></span>',
		timeout:0,
		showType:'slide'
	});
	$("#tipmsg").parent().parent(".window").css("bottom","0").css("position","fixed");
}