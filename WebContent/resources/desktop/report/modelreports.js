var mergesrows=[],mergescols=[];
var isfooter=false;

$(function(){
	dispatch();
});

function dispatch(){
	switch(id){
	case 4:
		modelreports4('last_name','subject',2);
		break;
	case 5:
		isfooter=true;
		generalGrid();
		break;
	case 6:
		modelreports4('last_name','actualamount',3);
		break;
	case 7:
		modelreports4('productname','vendorname',3);
		break;
	case 8:
		isfooter=true;
		generalGrid('duedate',4);
		break;
	case 9:
		isfooter=true;
		generalGrid();
		break;
	case 10:
		modelreports4('productname','quantity',5);
		break;
	case 11:
		modelreports4('accountname','productname',2);
		break;
	case 12:
		modelreports4('productname','accountname',3);
		break;
	case 13:
		modelreports4('accountname','productname',3);
		break;
	}
}

function modelreports4(){
	var param1=arguments[0];
	var param2=arguments[1];
	var param3=arguments[2];
	$.get('integradedreports/modelmerge/'+id+'/'+duedate+'',null,function(result){
		var result=result.rows;
		var calrowsindex=result[0].total+1;
		var calcolsindex=0,temp=0;
		$.each(result,function(i,rs){
			temp+=rs.total;
			calcolsindex=temp+i;
			if(i!=1 && i!=0)
				calrowsindex+=result[i-1].total+1;
			mergesrows.push({
				index:calrowsindex,
				rowspan:rs.total+1
			});
			
			mergescols.push({
				index:calcolsindex,
				colspan:param3
			});
		});
		mergesrows[0].index=0;
		generalGrid(param1,param2);
	},"json");
}

function generalGrid(){
	var param1=arguments[0];
	var param2=arguments[1];
	$('#modelreports').datagrid({
		url : 'integradedreports/modelreports',
		queryParams:{
			id:id,
			duedate:duedate
		},
		title:column_name[id-4],
		doSize:true,
		collapsible : false,
		singleSelect : true,
		rownumbers : true,
		showFooter:isfooter,
		columns : reports[id-4].columns,
		onLoadSuccess:function(data){
			if(id==4 || id==6 || id==7 || id==10 || id==11 || id==12 || id==13){
				for(var i=0; i<mergesrows.length; i++){  
		            $('#modelreports').datagrid('mergeCells',{  
		                index:mergesrows[i].index,  
		                field:param1,  
		                rowspan:mergesrows[i].rowspan
		            });  
				}
				for(var i=0; i<mergescols.length; i++){
		            $('#modelreports').datagrid('mergeCells',{  
		                index:mergescols[i].index,  
		                field:param2,  
		                colspan:mergescols[i].colspan
		            });
				}
			}
			if(id==8){
				$('#modelreports').datagrid('mergeCells',{  
					index:data.rows.length+1,  
	                field:param1,  
	                colspan:param2
	            });
			}
		}
    });
	setTitle();
}

function setTitle(){
	if(id<7){
		$(".po").append("销售明细－"+column_name[id-4]+"："+replace());
	}else{
		$(".po").append(column_name[id-4]+"："+replace());
	}
}

function replace()
{
   var re=new RegExp("BETWEEN","g");
   var newstart=duedate.replace(re,"");
   var re1=new RegExp("AND","g");
   return newstart.replace(re1,"到");
} 