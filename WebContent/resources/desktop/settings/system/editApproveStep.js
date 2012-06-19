$(function(){
	initApproveStepUsers();
});

function initApproveStep(){
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
				"<td width='100%'><img id='img_"+results[0].groupname+"' align='absmiddle' border='0' style='cursor: pointer;' onclick='showhide_dept('dept_"+results[0].groupname+"','img_"+results[0].groupname+"')' src='./resources/images/settings/system/themes/minus.gif'>"+
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
						"<td width='100%'><img id='img_"+results[i].groupname+"' align='absmiddle' border='0' style='cursor: pointer;' onclick='showhide_dept('dept_"+results[i].groupname+"','img_"+results[i].groupname+"')' src='./resources/images/settings/system/themes/minus.gif'>"+
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
		$("body").unmask();
	},"json");
}