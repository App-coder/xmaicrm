$(function(){
	initApproveStepUsers();
	initApproveStepFieldRole();
	initApproveStepAdvFilters();
});

function initApproveStep(){
	 if(type=='u'){
		 var arr=userid.toString().split(",");
		 for(var i=0;i<arr.length;i++){
			 var ii=parseInt(arr[i]);
			 $("input:checkbox[value="+ii+"]").attr('checked','true'); 	
			 $("#StepUserAlternate_"+ii).css('display','inline');
		 }
	 }
	 var elements=$('.StepUserClass');
	 for(var i=0;i<elements.size();i++){
		 var el=elements[i];
		 $(el).bind('click',function(){
			 var checkval=this.value;
			 var spanid="#StepUserAlternate_"+checkval;
			 if(this.checked){
			 $(spanid).css('display','inline');
			 }else{
			 $(spanid).css('display','none');
			 }
		 });
	 } 
}

function initApproveStepUsers(){
	$("body").mask('页面正在加载……');
	$.get("crm/settings/multiapprove/getApproveStepUsers",null,function(results){
		var stepUsersHtml="<table width='100%'>"+
				"<tr class='lvtColDataHover'>"+
				"<td width='100%'><img id='img_"+results[0].groupname+"' align='absmiddle' border='0' style='cursor: pointer;' onclick=\"showhide_dept('dept_"+results[0].groupname+"','img_"+results[0].groupname+"')\" src='./resources/images/settings/system/themes/minus.gif'>"+
				"<b>"+results[0].groupname+"</b>"+
				"</td>"+
				"</tr>"+
			"</table>"+
			"<table id='dept_"+results[0].groupname+"' width='40%' style='border-collapse: collapse;border:1px solid #EFEFF8;display: block;'>"+
			   "<tr id='row_2' class='lvtColData' bgcolor='white' onmouseout=\"this.className='lvtColData'\" onmouseover=\"this.className='lvtColDataHover'\">"+
			   "<td width='200' height='25'>"+results[0].user_name+"</td>"+
			   "<td width='200'><input class='StepUserClass' type=\"checkbox\" value='"+results[0].id+"' name='APPROVESTEP_"+results[0].groupname+"'>"+
			   "<span id='StepUserAlternate_"+results[0].id+"' style='display:none'>"+
			   "<input type=\"radio\" checked='' value='1' name='user_alter_"+results[0].id+"'>正式"+				
			   "<input type=\"radio\" value='0' name='user_alter_"+results[0].id+"'>候补	</span></td>" +
			   "</tr>";
		for(var i=1;i<results.length;i++){
			if(results[i].groupname==results[i-1].groupname){
				stepUsersHtml+= "<tr id='row_2' class='lvtColData' bgcolor='white' onmouseout=\"this.className='lvtColData'\" onmouseover=\"this.className='lvtColDataHover'\">"+
				   "<td width='200' height='25'>"+results[i].user_name+"</td>"+
				   "<td width='200'><input class='StepUserClass' type=\"checkbox\" value='"+results[i].id+"' name='APPROVESTEP_"+results[i].groupname+"'>"+
				   "<span id='StepUserAlternate_"+results[i].id+"' style='display:none'>"+
				   "<input type=\"radio\" checked='' value='1' name='user_alter_"+results[i].id+"'>正式"+				
				   "<input type=\"radio\" value='0' name='user_alter_"+results[i].id+"'>候补	</span></td>" +
				   "</tr>";
			}else{
				stepUsersHtml+="</table>"+
					"<table width='100%'>"+
						"<tr class='lvtColDataHover'>"+
						"<td width='100%'><img id='img_"+results[i].groupname+"' align='absmiddle' border='0' style='cursor: pointer;' onclick=\"showhide_dept('dept_"+results[i].groupname+"','img_"+results[i].groupname+"')\" src='./resources/images/settings/system/themes/minus.gif'>"+
						"<b>"+results[i].groupname+"</b>"+
						"</td>"+
						"</tr>"+
				    "</table>"+
				    "<table id='dept_"+results[i].groupname+"' width='40%' style='border-collapse: collapse;border:1px solid #EFEFF8;display: block;'>"+
					   "<tr id='row_2' class='lvtColData' bgcolor='white' onmouseout=\"this.className='lvtColData'\" onmouseover=\"this.className='lvtColDataHover'\">"+
					   "<td width='200' height='25'>"+results[i].user_name+"</td>"+
					   "<td width='200'><input class='StepUserClass' type=\"checkbox\" value='"+results[i].id+"' name='APPROVESTEP_"+results[i].groupname+"'>"+
					   "<span id='StepUserAlternate_"+results[i].id+"' style='display:none'>"+
					   "<input type=\"radio\" checked='' value='1' name='user_alter_"+results[i].id+"'>正式"+				
					   "<input type=\"radio\" value='0' name='user_alter_"+results[i].id+"'>候补	</span></td>" +
					   "</tr>";
			}
		}
		$("#dept_system").after(stepUsersHtml);
		initApproveStep();
	},"json");
}


function showhide_dept(deptId,imgId)
{
	var x=document.getElementById(deptId).style;
	if (x.display=="none")
	{
		x.display="block";
		document.getElementById(imgId).src = "./resources/images/settings/system/themes/minus.gif";
	}
	else
	{
		x.display="none";
		document.getElementById(imgId).src = "./resources/images/settings/system/themes/plus.gif";
	}
} 

function initApproveStepFieldRole(){
	$.get("crm/settings/multiapprove/getApproveStepFieldLabel",{tabid:tabid},function(labels){
		var labelsinfo=labels;
		var fieldRoleHtml="";
		$.get("crm/settings/multiapprove/getApproveStepFieldDetail",{tabid:tabid,stepid:stepid},function(blockitems){
			for(var i=0;i<labelsinfo.length;i++){
				fieldRoleHtml+="<fieldset><legend>"+labelsinfo[i].blocklabel+"</legend>"+
				               "<table class=\"small\" width=\"100%\" cellspacing='0' cellpadding='5' border='0'>";
				var flag=0;
				for(var j=0;j<blockitems.length;j++){
					if(blockitems[j].block==labelsinfo[i].block){
						if(flag%4==0)
							fieldRoleHtml+="<tr>";
						fieldRoleHtml+="<td style='width:20px'> </td><td width='5%'>";
						if(blockitems[j].stepreadonly==1&&type=='u')
							fieldRoleHtml+="<input type=\"checkbox\" class='StepFieldClass' checked name=\""+blockitems[j].fieldid+"\">";
						else
							fieldRoleHtml+="<input type=\"checkbox\" class='StepFieldClass' name=\""+blockitems[j].fieldid+"\">";
						fieldRoleHtml+="</td><td width='25%' nowrap=''>"+blockitems[j].fieldlabel+"</td>";
						if(flag%4==3)
							fieldRoleHtml+="<tr>";
						flag+=1;    
					}
				}
				if(flag<3){
					fieldRoleHtml+="<td style='width:20px'> </td><td width='5%'></td>"+
									"<td width='25%' nowrap=''></td><td style='width:20px'> </td>"+
									"<td width='5%'></td><td width='25%' nowrap=''></td>"+
									"<td style='width:20px'> </td><td width='5%'></td>"+
									"<td width='25%' nowrap=''></td>";
				}
				fieldRoleHtml+="</table></fieldset>";
			}
			$("#countrycontainer2").empty();
			$("#countrycontainer2").append(fieldRoleHtml);
		},'json');
	},'json');
}

function initApproveStepAdvFilters(){
	$.get("crm/settings/multiapprove/getTabName",{tabid:tabid},function(tabs){
		var modulename=tabs.name+"_Status";
		var advFilters="<fieldset><legend>动态赋值</legend>" +
				         "<table class=\"small\" width=\"100%\" cellspacing='0' cellpadding='5' border='0'>";
		$.get("crm/settings/multiapprove/getApproveStepAdvFilters",{tabid:tabid},function(result){
			var filterOption=result[0].tablename+":"+result[0].columnname+":"+result[0].fieldname+":"+modulename+":"+result[0].typeofdata.substr(0,1);
			for(var i=1;i<6;i++){
				advFilters+="<tr class=\"dvtCellLabel\">"+
				"<td>"+
				"<select id=\"fcol"+i+"\" name=\"fcol"+i+"\">"+
				"<option value='' selected=''>无</option>"+
				"<option value=\""+filterOption+"\">状态</option>"+
				"</select>" +
				"  =  ";
				advFilters+="<input id=\"fval"+i+"\" type='text' value='' maxlength='80' size='30' name=\"fval"+i+"\">"+
							"</td>"+
							"</tr>";
			}
			advFilters+="</table></fieldset>";
			$("#countrycontainer3").empty();
			$("#countrycontainer3").append(advFilters);
			if(type=='u')
				setStepAdvFilter();
			$("body").unmask();
			
		},'json');
	},'json');
}

function setStepAdvFilter(){
	$.get("crm/settings/multiapprove/getStepAdvFilterById",{stepid:stepid},function(filters){
		for(var i=1;i<=filters.length;i++){
			$("#fcol"+i+"").get(0).selectedIndex=1;
			$("#fval"+i+"").val(filters[i-1].thevalue);
		}
	},'json');
}

function doMultiApprove(){
	var step={
			name:$("input[name=name]").val(),
			nextstep:$("select[name=nextstep] option:selected").val(),
			ended:$("select[name=ended] option:selected").val(),
			alterapproveowner:$("select[name=alterapproveowner] option:selected").val(),
			updated_at:showLocale(new Date()),
			memo:$("textarea[name=memo]").val(),
			tabid:tabid
	};
	var step2users=[];
	$("input:[class=StepUserClass]:checked").each(function(){ 
		step2users.push({
			userid:$(this).val(),
			alternate:$("input[name='user_alter_"+$(this).val()+"']:checked").val()
		});
	}); 
	
	var step2fields=[];
	$("input:[class=StepFieldClass]:checked").each(function() { 
		step2fields.push($(this).attr("name"));
	}); 
	var step2advoption=[];
	var adv=[];
	for(var j=1;j<6;j++){
		if($("#fval"+j+"").val()!=="")
			adv.push($("#fval"+j+"").val());
	}
	if(adv.length==0)
		step2advoption.push({
			columnname:$("#fcol1").val(),
		    thevalue:'0'
		});
	else
		step2advoption.push({
			columnname:$("#fcol1").val(),
		    thevalue:adv.join(",")
		});
	var param={
		   type:type,
		   stepid:stepid,
		   step:new JSONUtil().stringify(step),
		   step2users:new JSONUtil().stringify(step2users),
		   step2fields:step2fields.join(","),
		   step2advoption:new JSONUtil().stringify(step2advoption)
	};
	$("body").mask('页面正在加载……');
	$.post("crm/settings/multiapprove/submit",param,function(result){
		if(result.type){
			window.location.href="crm/settings/multiapprove/showApproveStep?approveid="+approveid+"";
			$("body").unmask();
		}
	},'json');
}
