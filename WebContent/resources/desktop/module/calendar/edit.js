$(function() {
    initPage();
});
function initPage() {

    $("#form_calendar").form({
	url : "crm/module/calendar/edit",
	onSubmit : function() {
            if(!$('#form_calendar').form("validate")){
        	return false;
            }
            if(kinds.length>0){
        	for(var i=0;i<kinds.length;i++){
        	    kinds[i].sync();
        	}
            }
            
            //设置关联的同事，共享日程
            setRelUser();
            
	    return true;
	},
	success : function(data) {
	    var data = $.parseJSON(data);
	    if(data.type == true){
		return;
		//转向到详细页面
		window.location.href = "crm/module/calendar/index?ptb="+ptb;
	    }
	}
    });
    
    initRelInvite();
    initRecurring();
}

function initRecurring(){
    var wkens = ["sunday","monday","tuesday","wednesday","thursday","friday","saturday"];
    if(recurringtype!=''){
	$("#tr_recurring").show();
	$("#recType").val(recurringtype);
	
	if(recurringtype == 'Weekly'){
	    var wklist = recurringinfo.split("::");
	    for(var i=1;i<wklist.length;i++){
		$("input[name=recurring_week][value="+wkens[wklist[i]]+"]").attr("checked",true);
	    }
	    $("#tr_re_week").show();
	}else if( recurringtype == 'Monthly'){
	    var mnlist = recurringinfo.split("::");
	    $('#month_day').numberbox('setValue', mnlist[2]);
	    $("#tr_re_month").show();
	}
	
    }
}

function initRelInvite(){
    $("#rel_invite").combotree({  
	url: 'crm/relation/users/getCkSmowners',
	multiple:true,
	onLoadSuccess:function(node,data){
	    $("#rel_invite").combotree("setValues",invitees);
	}
    });  
}

/**
 * 
 * Form表单，窗口输入等。
 * 
 * @param columnname
 * @param data
 * @param win
 */
function rendRel(columnname,data){
    if(columnname == "accountid"){
	$.get('crm/contactdetails/getContactsByAccountid',{accountid:data.accountid},function(res){
	    if(res.length>0){
		var opstr = "";
		for(var i=0;i<res.length;i++){
		    opstr +="<option value='"+res[i].contactid+"'>"+res[i].lastname+"</option>";
		}
		$("select[name=contact_id]").html(opstr);
	    }
	},'json');
    }
}

function relAccount(columnname,data){
    $("#optionwindow").window({
	title:"选择客户",
	border:false
    });
    $("#optionframe").attr("src","crm/customview/viewPop?modulename=Accounts&action=calendar_relAccount&field=rel_accountid&_rd="+rdnum());
    $("#optionwindow").window("open");
}

function setRelUser(){
    var ckedstr = "";
    var cked =  $('#rel_invite').combotree('tree').tree('getChecked');
    for(var i=0;i<cked.length;i++){
	if(i == 0){
	    ckedstr +=cked[i].id;
	}else{
	    ckedstr +=","+cked[i].id;
	}
    }
    $("input[name=rel_invitees]").val(ckedstr);	
}
function showCfgRemindertime(){
    $("#cfg_remindertime").show();
}
function hideCfgRemindertime(){
    $("#cfg_remindertime").hide();
}
function showCfgOption(){
    var iscked = $("input[name=recurring]").attr("checked");
    if(iscked == 'checked'){
	$("#tr_recurring").show();
    }else{
	$(".isrecurring").hide();
	
	//重新设置值的空项目 
	$(".weekcfg").find("input[type=checkbox]").removeAttr("checked");
	$("input[name=month_day]").val("");
    }
}
function showRecOption(opt){
    if(opt == "Weekly"){
	$("#tr_re_week").show();
	$("#tr_re_month").hide();
    }else if(opt == "Monthly"){
	$("#tr_re_month").show();
	$("#tr_re_week").hide();
    }else{
	$("#tr_re_month").hide();
	$("#tr_re_week").hide();	
    }
}