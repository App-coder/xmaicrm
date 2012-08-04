function qqInput(){
	(
	function(q){q?q.toggle():function(d,j){j=d.createElement('script');j.async=true;j.src='http'+(0==d.URL.indexOf('https')?'s':'')+'://ime.qq.com/fcgi-bin/getjs';j.setAttribute('ime-cfg','lt=2');d=d.getElementsByTagName('head')[0];d.insertBefore(j,d.firstChild)}(document)})(window.QQWebIME)
	}
//用户登录
function checkForm(w,s){
	var url  = w+'/member/doLogin'+s;
	var user=$('input#loginId').val();
	var psw=$('input#password').val();
	var verCode=$('input#kaptcha').val();
	var question=$('select#question').val();
	var answer=$('input#answer').val();
	if($('input#loginId').val()==""){
		errorTip("#loginMsg","用户名不能为空!");
		return;
	}
	if($('input#password').val()==""){
		errorTip("#loginMsg","密码不能为空!");
		return;
	}
   	$.post(url, {
		"loginId" : user,
		"password" : psw,
		"verCode" : verCode,
		"question" : question,
		"answer" : answer
	}, function(data) {
		if(data.status==1){
			var wpo=parent.document.getElementById("TB_window");
			if(wpo==null||typeof(wpo)=="undefined"){
				window.location=w+"/member/index"+s;
			}else{
				parent.tb_remove();
				loadLoginInfoData(w+'/member/loginInfo'+s);
			}
		}else {
			errorTip("#loginMsg",data.message);
			$('#kaptchaImage').hide().attr('src', w+'/admin/vercode'+s+'?' + Math.floor(Math.random()*100) ).fadeIn();
		}
	}, "json");
}





function searchData(w,s){
	if(document.getElementById('search-keyword').value==''){
		alert('请输入搜索内容');
		return false;
	}
	var type=document.getElementById('searchType').value;
	if(type==0){
		window.location.href=w+"/luceneSearch"+s+"?keyword="+encodeURIComponent(document.getElementById('search-keyword').value)+"&searchType="+type;
	}else{
		window.location.href=w+"/search"+s+"?keyword="+encodeURIComponent(document.getElementById('search-keyword').value)+"&searchType="+type;
	}
	
}
function converterTime(myDate,f) {
	var timezoneOffset = new Date().getTimezoneOffset()/60*-1;
	return  new Date(myDate*1000 + (3600000*timezoneOffset)).format(f);
}
Date.prototype.format = function(fmt)   
{
  var o = {   
    "M+" : this.getMonth()+1,                 //月份   
    "d+" : this.getDate(),                    //日   
    "h+" : this.getHours(),                   //小时   
    "m+" : this.getMinutes(),                 //分   
    "s+" : this.getSeconds()                 //秒   
  };   
  if(/(y+)/.test(fmt))   
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
  for(var k in o)   
    if(new RegExp("("+ k +")").test(fmt))   
  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
  return fmt;   
}


function errorTip(errorObj,warning){
	$(errorObj).html(warning);
	setTimeout(function(){$(errorObj).html('');},3000);
}