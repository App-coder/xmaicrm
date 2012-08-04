
function loadLoginInfoData(path) {
	parent.$("#loginInfo").load(path,   function() {
		parent.$("#loginInfo").fadeIn("slow");
    }
    );
}
function kaptchaVerCode(path){
	$("#kaptchaImage").hide().attr('src',path+ Math.floor(Math.random() * 100)).fadeIn();
}

function javash_win(title,url){
	 window.top.tb_show(title, url, false);
}