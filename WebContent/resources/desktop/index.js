$(function(){
    $('#tabs').tabs({
	onClose : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	},
	onOpen : function() {
	    // 消除多余的window
	    $("#" +
	    		"").nextAll("div").remove();
	}
    });
    tab('首页', 'welcome/homepage');
    
    $('#quick').combobox({   
      url:'resources/test/combobox_data.txt',   
      height:10,
      valueField:'id',   
      textField:'text',
      method:"get"
    });  
});