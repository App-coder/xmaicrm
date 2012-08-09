
var tbname="",tburl="",columns="";
var duedate="";
var params="";




function build_table(){
	var table="<tbody><tr bgcolor='white'>" +
			    "<td bgcolor='#F7F7F0' align='center' style='line-height: 20px;'><font color='#999999'>表名&nbsp;&nbsp;</font></td>" +
			    "<td bgcolor='#F7F7F0' align='center' style='line-height: 20px;' colspan='13'><font color='#999999'>时间段</font></td>" +
			    "</tr>";
	var temp=table;
	table+=table1();
	table+="</tbody>";
	$('#sales_details').append(table);
	
	temp+=table2();
	temp+="</tbody>";
	$('#purchase_details').append(temp);
}

function table1(){
	var t1="";
	for(var i=4;i<7;i++){
		t1+="<tr bgcolor='white'><td><font color='#3366FF'>"+i+".</font>"+column_name[i-4]+"</td>";
		for(var j=0;j<13;j++){
			t1+="<td><a href='javascript:integradedreports("+i+","+j+");'>"+month[j]+"</a></td>";
		}
		t1+="</tr>";
	}
	return t1;
}

function table2(){
	var t1="";
	for(var i=7;i<14;i++){
		t1+="<tr bgcolor='white'><td><font color='#3366FF'>"+i+".</font>"+column_name[i-4]+"</td>";
		for(var j=0;j<13;j++){
			t1+="<td><a href='javascript:integradedreports("+i+","+j+");'>"+month[j]+"</a></td>";
		}
		t1+="</tr>";
	}
	return t1;
}


function integradedreports(i,j){
	if(j==0)
		duedate="BETWEEN '"+year+"-01-01 00:00:00 00:00:00' AND '"+year+"-12-31 23:59:59 23:59:00'";
	else
		duedate="BETWEEN '"+year+"-"+j+"-01 00:00:00' AND '"+year+"-"+j+"-31 23:59:59'";
	tbname=reports[i-4].tbname;
	params="{'duedate':\""+duedate+"\",'id':"+reports[i-4].id+"}";
	
	tburl="integradedreports/modelreports/index/"+params+"";
	window.open (tburl);
}



$(function(){
	build_table(); 
	$('.selyear').attr("value",year);
	$('.selyear').change(function(){
		var year=$('.selyear').val();
		var pp = $('#tabs').tabs("getTab", '综合报表');   
		$('#tabs').tabs("update",{tab:pp,options:{href:"integradedreports/index/"+year+""}});
	});
});
