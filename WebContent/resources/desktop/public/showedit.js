//显示选项的optionwindow，用于选项的选择
function showOptionPanel(modulename,columnname,fieldlabel){
    $("#optionwindow").window({
	title:"选择"+fieldlabel
    });
    $("#optionframe").attr("src","crm/customview/viewPop?modulename="+modulename+"&columnname="+columnname);
    $("#optionwindow").window("open");
}