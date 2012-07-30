$(function() {
    initPage();
    initForm();
});

var tabid=6;
var oDD=null;
var uitype;
var precfimagecombo="resources/images/settings/system/themes/";
var fieldValueArr=new Array('文本','数字','百分比','货币','日期','Email','电话','下拉框','网址','复选框','文本域','多选框','QQ','Msn','贸易通','Yahoo','Skype');
var fieldTypeArr=new Array('text','number','percent','currency','date','email','phone','picklist','url','checkbox','textarea','multiselectcombo','qq','msn','trade','yahoo','skype');
var cfimagecombo=new Array("text.gif","number.gif","percent.gif","cfcurrency.gif","date.gif","email.gif","phone.gif","cfpicklist.gif","url.gif","checkbox.gif","text.gif","cfpicklist.gif","qq.gif","msn.jpg","trade.jpg","yahoo.gif","skype.gif");
var fieldUiType=new Array("1","7","9","71","5","13","11","15","17","56","21","33","86","87","88","89","85");
var typeofdata="";
var params="";
var updaterow;
var colvalue="";


var cols = [{
	field:'fieldlabel',
	title:'字段标签'
},{
	field:'uitype',
    title:'字段类型'
}];
cols = setDefWidth(cols,80);

//初始化
function initForm() {
	$("#cfcombo").msDropDown();
	oDD = $('#cfcombo').msDropDown().data("dd");
	for(var i=0;i<fieldValueArr.length;i++){
		oDD.add({text:fieldValueArr[i], value:i, title:precfimagecombo+cfimagecombo[i]}); 
	}
	$("#cfcombo").msDropDown({style:'background-color:#333, font-size:24px'}); 
	$("#cfcombo").msDropDown({visibleRows:5, rowHeight:25});
	$("#cfcombo").msDropDown({onInit:'callinitmethod'}); 
	
	$(".importBox").change(function(){
    	tabid=$(".importBox").val();
    	$('#customfieldlist').datagrid('load',{  
            tabid: tabid  
        });  
    });
	
	$("#customfield").window({
		onOpen:function(){
			$("#decimaldetails").hide("slow");
	    	$("#picklist").hide("slow");
		}
	});

    $('#form_customfield').form({
		url : 'crm/settings/customfield/submit',
		onSubmit : function() {
		    if ($('#form_customfield').form("validate")) {
			     return true;
		    } else {
			     return false;
		    }
	    },
		success : function(res) {
		    res = $.parseJSON(res);
		    if(res.type == true){
		       closeWin('customfield');
//		       $('#form_customfield').form("clear"); //bug
		       $("input[name=fldLength]").attr("readonly",false);
			   $("input[name=fldDecimal]").attr("readonly",false);
		       $(".validatebox-tip").hide();
		       $('#customfieldlist').datagrid("reload",{  
		            tabid: $(".importBox").val() 
		       });
		    }
		}
    });
}

function initPage(){
	$.get("crm/settings/customblock/getBlockList",null,function(result){
		var options="";
		$.each(result,function(i,block){
			options+="<option value='"+block.tabid+"'>"+block.tablabel+"</option>";
		});
		$(".importBox").append(options);
		$(".importBox").get(0).selectedIndex=0;
		tabid=$(".importBox").get(0).options[0].value;
		initGrid();
	},"json");
}

function initGrid(){
	$('#customfieldlist').datagrid({
		url : 'crm/settings/customfield/getFieldsByTabid',
		queryParams:{
			tabid:tabid,
		},
		doSize:true,
		height : 362,
		collapsible : false,
		singleSelect : true,
		rownumbers : true,
		fitColumns:true,
		toolbar : [ {
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
		    	$("input[name=action]").val("add");
				$("#customfield").window({
				    title : "新增显示区域",
				    onOpen:function(){
				    	$("textarea[name=fldPickList]").html("&nbsp;"); 
				    	$("input[name=fldLength]").attr("readonly",false);
						$("input[name=fldDecimal]").attr("readonly",false);
					    $(".validatebox-tip").hide();
					    $("#fieldType").show("slow");
				    },
				});
				
				$("#customfield").window("open");
		    }
		},{
		    text : '修改',
		    iconCls:'icon-edit',
		    handler : function() {
		    	var selected = $('#customfieldlist').datagrid("getSelected");
				if (selected) {
				    $("input[name=action]").val("update");
				    // 赋值操作
				    updaterow=selected;
				    loadForm(selected);
				} else {
				    message("请选择一行记录！");
				}
		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
		    	var selected = $('#customfieldlist').datagrid("getSelected");
		    	var param={
		    			fieldid:selected.fieldid,
		    			columnname:selected.columnname,
		    			tablename:selected.tablename,
		    			uitype:selected.uitype
		    	};
		    	var params=new JSONUtil().stringify(param);
				if (selected) {
				    confirm('确定删除?',function(r){
					if (r){  
					    $.post("crm/settings/customfield/submit",{queryParams:params,action:"delete"},function(res){
							if(res.type == true){
							    $('#customfieldlist').datagrid("reload");
							}
					    },'json');			        
					}  
				    });
				}else {
				    message("请选择一行记录！");
				}
		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		columns : [ cols ]
	});
}

//编辑窗口的初始化
function loadForm(row) {
	$('#form_customfield').form('load',{
		fldLabel:row.fieldlabel,
	});
	$("#customfield").window({
	    title:'编辑自定义字段'+"--"+row.uitype,
	    onOpen:function(){
		    $(".validatebox-tip").hide();
		    $("#fieldType").hide("slow");
		    editFieldType(row);
	    },
	    onClose:function(){
//	    	$('#form_customfield').form("clear");
	    	$("textarea[name=fldPickList]").html("&nbsp;");
	    	$("input[name=fldLabel]").val("");
	    	$("input[name='fldMandatory']").attr("checked",false);
	    	$("input[name=fldLength]").val("");
	    	$("input[name=fldDecimal]").val("");
	    	$(".validatebox-tip").hide();
	    }
	});
	$("#customfield").window("open");
}

function callinitmethod(){
	$("#decimaldetails").hide("slow");
	$("#picklist").hide("slow");
}

//获取下拉框列表的值
function getPickList(colname){
	colvalue="";
	$.get("crm/settings/customfield/getPickListByColname",{colname:colname},function(result){
		$.each(result,function(i,pick){
			colvalue+=pick.colvalue+"\n";
		});
		colvalue=colvalue.substr(0,colvalue.length-1);
		$("textarea[name=fldPickList]").html(colvalue);
	},"json");
}

function editFieldType(row){
	var type=row.uitype;
	var ischeck=row.typeofdata.substr(2,1);
	if(ischeck=='O')
		$("input[name='fldMandatory']").attr("checked",false);
	else
		$("input[name='fldMandatory']").attr("checked",true);
	
	if (type=='文本') {
		$("#lengthdetails").show("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").hide("slow");
		$("input[name=fldLength]").attr("readonly",true);
		$("input[name=fldLength]").val(row.typeofdata.substr(7));
	} else if (type=='日期' || type=='Email' || type=='电话' || type=='网址' || type=='复选框' || type=='文本域' || type=='QQ' || type=='Msn' || type=='贸易通' || type=='Yahoo' || type=='Skype') {
		$("#lengthdetails").hide("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").hide("slow");
	} else if (type=='数字' || type=='百分比' || type=='货币') {
		$("#lengthdetails").show("slow");
		$("#decimaldetails").show("slow");
		$("#picklist").hide("slow");
		$("input[name=fldLength]").attr("readonly",true);
		$("input[name=fldDecimal]").attr("readonly",true);
		$("input[name=fldLength]").val(row.typeofdata.substr(4,2));
		$("input[name=fldDecimal]").val(row.typeofdata.substr(7,1));
	} else if (type=='下拉框' || type=='多选框') {
		$("#lengthdetails").hide("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").show("slow");
		getPickList(row.columnname);
	}
}

function selFieldType(id) {
	var ids=parseInt(id);
	uitype=fieldUiType[id];
	var type=fieldTypeArr[ids];
	if (type=='text') {
		$("#lengthdetails").show("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").hide("slow");
	} else if (type=='date' || type=='email' || type=='phone' || type=='url' || type=='checkbox' || type=='textarea' || type=='qq' || type=='msn' || type=='trade' || type=='yahoo' || type=='skype') {
		$("#lengthdetails").hide("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").hide("slow");
	} else if (type=='number' || type=='percent' || type=='currency') {
		$("#lengthdetails").show("slow");
		$("#decimaldetails").show("slow");
		$("#picklist").hide("slow");
	} else if (type=='picklist' || type=='multiselectcombo') {
		$("#lengthdetails").hide("slow");
		$("#decimaldetails").hide("slow");
		$("#picklist").show("slow");
	}
	setCfType(type);
} 

//设定字段类型
function setCfType(type){
	if(type=='text' || type=='email' || type=='phone' 
		|| type=='url' || type=='email' || type=='qq' || type=='msn'
			|| type=='trade' || type=='yahoo' || type=='skype' || type=='picklist' || type=='multiselectcombo')
		typeofdata='V';
	else if(type=='checkbox')
		typeofdata='C';
	else if(type=='date')
		typeofdata='D';
	else
		typeofdata='N';
}

function submitCustomField(){
	var fieldname=$("input[name=fldLabel]").val();
	var fieldpicklist=$("textarea[name=fldPickList]").html()=="&nbsp;"?"undefined":$("textarea[name=fldPickList]").val();
	var arrpick = fieldpicklist.split('\n').join(",");
	
	if($("input[name=action]").val()=="add"){
		var temp=typeofdata;
		var defieldtype;
		if($("input[name='fldMandatory']").attr('checked')==undefined)
			typeofdata+="~O";
		else
			typeofdata+="~M";
		
		var fieldlength=$("input[name=fldLength]").val();
		var fielddecimal=$("input[name=fldDecimal]").val();
		
		if(uitype==1)
			typeofdata+="~LE~"+fieldlength;
		else if(uitype==9)
			typeofdata+="~"+fieldlength+"~"+fielddecimal;
		else if(uitype==7 || uitype==71)
			typeofdata+="~"+fieldlength+","+fielddecimal;
		
		if(temp=='D')
			defieldtype="date";
		else if(temp=='N')
			defieldtype="decimal("+fieldlength+","+fielddecimal+")";
		else if(temp=='C')
			defieldtype="varchar(255)";
		else if(temp=='V' && uitype!=33)
			defieldtype="varchar(255)";
		else
			defieldtype="text";
		var cfField=defieldtype;
		params="{arrpick:\""+arrpick+"\",tabid:"+tabid+",cfField:\""+cfField+"\",uitype:"+uitype+",fieldlabel:\""+fieldname+"\",typeofdata:\""+typeofdata+"\"}";
	}else{
		var temp= updaterow.typeofdata.charAt(2);
		if($("input[name='fldMandatory']").attr('checked')==undefined)
			updaterow.typeofdata=updaterow.typeofdata.replace(temp,"O");
		else
			updaterow.typeofdata=updaterow.typeofdata.replace(temp,"M");
		var param={
				typeofdata:updaterow.typeofdata,
				fieldlabel:fieldname,
				fieldid:updaterow.fieldid,
				columnname:updaterow.columnname,
				arrpick:arrpick
		};
		params=new JSONUtil().stringify(param);
	}
	
	$("input[name=queryParams]").val(params);
    formsubmit("form_customfield");
}
