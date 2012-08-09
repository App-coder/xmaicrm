var cangkuinfo_columns=[[  
	   {field:'cangkuname',title:'仓库',width:100,align:'right'},  
	   {field:'prodcount',title:'种类',width:100,align:'right'},
	   {field:'cangkucount',title:'库存数',width:100,align:'right'},
	   {field:'assets',title:'资产',width:100,align:'right'}
    ]];

var cangkuinfo={};

$(document).ready(function(){
	$('#cangkuinfo').datagrid({
		url : 'integradedreports/cangkuinfo',
		doSize:true,
		collapsible : false,
		singleSelect : true,
		showFooter:true,
		columns : cangkuinfo_columns,
		onLoadSuccess:function(data){
		    $('#cangkuinfo').datagrid('fixColumnSize'); 
		}
   });
	cangkuinfo.getCurDate();
});

cangkuinfo.getCurDate=function(){
	 var d = new Date();
	 var week;
	 switch (d.getDay()){
		 case 1: week="星期一"; break;
		 case 2: week="星期二"; break;
		 case 3: week="星期三"; break;
		 case 4: week="星期四"; break;
		 case 5: week="星期五"; break;
		 case 6: week="星期六"; break;
		 default: week="星期天";
	 }
	 var years = d.getFullYear();
	 var month = cangkuinfo.add_zero(d.getMonth()+1);
	 var days = cangkuinfo.add_zero(d.getDate());
	 var hours = cangkuinfo.add_zero(d.getHours());
	 var minutes = cangkuinfo.add_zero(d.getMinutes());
	 var seconds=cangkuinfo.add_zero(d.getSeconds());
	 var ndate = years+"年"+month+"月"+days+"日 "+hours+":"+minutes+":"+seconds+" "+week;
	 $(".po").append("当前库存资产: "+ndate);
};

cangkuinfo.add_zero=function(temp){
	 if(temp<10) return "0"+temp;
	 else return temp;
};

