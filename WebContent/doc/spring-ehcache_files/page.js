function loadComment(){
	$("#verCode").val('');
	$("#commentsText").focus(function(){$("#showCode").css({display: "block"});});
	$("#commentsText").val("");
	var limitNum = 500;
	var pattern = '还可以输入' + limitNum + '字符'; 
	$('#commentsFontMsg').html(pattern); 
	$("#commentsText").keyup(function() {
	var result = limitNum -  getByteLen($(this).val());
	pattern = '还可以输入' + result + '字符';
	$('#commentsFontMsg').html(pattern); 
	if (result <0) {
		errorTip("#commentsFontMsg","亲,内容太多啦^_^,请尽量简单明了!");
	}});
}

function getByteLen(val) {    //传入一个字符串
    var len = 0;
    for (var i = 0; i < val.length; i++) {
        if (val[i].match(/[^\x00-\xff]/ig) != null) //全角 
            len += 2; //如果是全角，占用两个字节
        else
            len ++; //半角占用一个字节
    }
    return len;
 }    

function favorite(t,w,mId,nId,cId,s){
	if(confirm( "确定要收藏么?" ))
	{
		var url=window.location.href;
		url=url.substring(w.length+1,url.length);
		$.post(w+'/member/addMemberFavorite'+s, {
			"title" : t,
			"modelId" : mId,
			"nodeId" : nId,
			"contentId" : cId,
			"url" : url
		}, function(data) {
			if(data.status==1){
				alert('收藏成功');
			}else if(data.status==2) {
				alert('你已经收藏过了');
			}else{
				alert('请登录后在进行收藏');
				javash_win('登录',w+'/member/login'+s+'?keepThis=true&TB_iframe=true&height=280&width=420');
			}
		}, "json");
	}
}

//替换页面中的表情代码为图片
function convertImg(val,url){
	//url=url+'/template/js/faceImg/';
	//return val.replace(/\[@/g, "<img src="+url).replace(/\@]/g, ".gif />");;
	//var s;
	//将字符串中如"[微笑]"类的表情代号替换为<img/>标签
	return $.expBlock.textFormat(val);
	
}

function htmlEncode(html)   
{   
	return html.replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/\[br]/g,'<br />');
}   

function htmlDecode(html)   
{ 
	return html.replace('{//引用','').replace('//}','').replace(/\<br>/g,'[br]').replace(/&amp;/g,'&').replace(/&lt;/g,'<').replace(/&gt;/g,'>');
}

function postForm(url,suffix){
   var u  = url+'/comments/add'+suffix;
   var contentId=$('input#contentId').val();
   var commentsText=$('textarea#commentsText').val();
   var verCode=$('input#verCode').val();
   commentsText= commentsText.replace(/<[ ]{0,}\/?[ ]{0,}(?:script|style|iframe|a|img)[ ]{0,}>/gi, ""); 
   
 // commentsText= commentsText.replace(/<.*?>/g,"");
  commentsText=convertImg(htmlEncode(commentsText),url);

   if($("#commentsText").val().length<1)
   {
   		$("#commentsText").focus(function(){$("#commentsText").val($("#commentsText").val());});  
 		$("#commentsText").focus(); 
    	errorTip("#commentsMsg","评论不能为空!");
   		return false;
   }else{
   
   	if ($("#commentsText").val().length <10) {
		$("#commentsText").focus(function(){$("#commentsText").val($("#commentsText").val());});  
 		$("#commentsText").focus(); 
    	errorTip("#commentsMsg","内容少于十个字符啦^_^,多加点!");
    	return false;
		}
   }

   if ($("#verCode").val().length <3) {
   		errorTip("#commentsMsg","别偷懒,输入一下验证码!");
   		$("#verCode").val('');
   		$("#verCode").focus();
   		return false;
   }
   //如果更改了评论分页数量请更改这里pageMax值，要对应,缓存需要的参数
	$.post(u, {
		"contentId" : contentId,
		"commentsText" : commentsText,
		"verCode" : verCode,
		"pageMax" : 8
	}, function(data) {
		if(data.status==0){
			$("#commentsMsg").html(data.message);
			$("#verCode").val('');
			$("#verCode").focus();
			kaptchaVerCode(url+'/admin/vercode'+suffix+'?');
			}else if(data.status==1){
				$("#commentsText").val('');
				$("#verCode").val('');
				$("#commentsMsg").html(data.message);
				var urls=location.href;
				if(urls.indexOf('?')=='-1'){
					$("#commentListContent").load(location.href+"?rnd="+(Math.ceil(Math.random()*1000))+" #commentListContent");
				}else{
					$("#commentListContent").load(location.href+"&rnd="+(Math.ceil(Math.random()*1000))+" #commentListContent");
				}
				
			  
			kaptchaVerCode(url+'/admin/vercode'+suffix+'?');
			}else if(data.status==2){
				$("#commentsMsg").html(data.message);
				javash_win('登录',url+'/member/login'+suffix+'?keepThis=true&TB_iframe=true&height=280&width=420');
			$("#verCode").val('');
			}else{
			$("#commentsMsg").html(data.message);
		}
	}, "json");
}


function postMemberFavorite(modelId,nodeId,contentId,url,suffix){
	url: url+'/member/addMemberFavorite'+suffix;
	$.post(url, {
		"modelId" : modelId,
		"nodeId" : nodeId,
		"contentId" : contentId
	}, function(data) {
		if(data.status==0){
			alert(data.message);
		}else if(data.status==1){
			alert(data.message);
			javash_win('登录',url+'/member/login'+suffix+'?keepThis=true&TB_iframe=true&height=280&width=420');
		}else{
			alert(data.message);
		}
	}, "json");
}

function openCommentsUrl(w,s,id){
	window.location.href=w+"/comments/id/"+id+s;
}