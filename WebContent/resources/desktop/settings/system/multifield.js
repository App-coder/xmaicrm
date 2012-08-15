$(function(){
    loadFields();
});

var multicols=[{
	field : 'multifieldname',
	title : '级联字段标签'
}
               
               
];

var tabid=0;
var levels=[];
function loadFields(){
    tabid = $("#selectmodule").val();
    reloadGrid();
}
function reloadGrid(){
    var cols = [ {
	field : 'multifieldname',
	title : '字段标签'
    }, {
	field : 'totallevel',
	title : '级联字段'
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#multifieldlist').datagrid({
		url:"crm/settings/multifield/getCustomMultiField",
		collapsible : false,
		idField : 'multifieldid',
		singleSelect : true,
		rownumbers : true,
		pagination : false,
		fitColumns : true,
		height : 362,
		queryParams:{tabid:tabid},
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ cols ],
    });
}

function gotoEditCustomField(){
	var selected = $('#multifieldlist').datagrid("getSelected");
	var params={
		multifieldid:selected.multifieldid
	};
	$.get("crm/settings/multifield/getMultiLevel1",params,function(result){
		var tablename=result[0].tablename;
		var multifieldname=result[0].multifieldname;
		var totallevel=result[0].totallevel;
		var tod='%::'+selected.multifieldid+'%';
		$.get("crm/settings/multifield/getMultiLevelField",{thelevel:1,parentfieldid:0,tablename:tablename},function(result){
			levels.splice(0,levels.length);
			$.each(result,function(i,rs){
				levels.push(rs);
			});
			//弹出级联二级页面
			$("#multifield_window").window({
				title:'编辑级联字段信息',
				onOpen:function(){
					$("#multifieldname").val(multifieldname);
					generalMultiLevel2(tod,totallevel);
			    },
			});
			$("#multifield_window").window("open");
		},"json");
	},"json");
}

function generalMultiLevel2(tod,totallevel){
	var cols=[{
		field:'fieldlabel',
		title:'级联字段标签'
	},{field:'fieldname',title:'级联字段值',width:80,
			formatter:function(){
				return "--未选择--";
			},
			editor:{
				type:'combobox',
				options:{
					valueField:'actualfieldid',
					textField:'actualfieldname',
					//data:products,
					//required:true
				}
			}
	},{field:'typeofdata',title:'是否必填',width:40,align:'center',
			editor:{
				type:'checkbox',
				options:{
					on: 'M',
					off: 'O'
				}
			}
	}];
	
	$("#multifield_grid").datagrid({
		url:"crm/settings/multifield/getMultiLevel2",
		collapsible : false,
		idField : 'fieldid',
		singleSelect : true,
		rownumbers : true,
		pagination : false,
		fitColumns : true,
		height : 152,
		queryParams:{tabid:tabid,typeofdata:tod},
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ cols ],
		onLoadSuccess:function(data){	
			  for(var i=0;i<totallevel;i++)
				  $('#multifield_grid').datagrid('beginEdit',i);
			  var ed = $('#multifield_grid').datagrid('getEditor', {index:0,field:'fieldname'});
			  $(ed.target).combobox('clear');  
			  $(ed.target).combobox({
			         data:levels
					 /*onSelect:function(record){
						$('#multifield_grid').datagrid('beginEdit', '1');
						var ed1 = $('#multifield_grid').datagrid('getEditor', {index:1,field:'productid'});//clear
						$(ed1.target).combobox('clear');  
						$(ed1.target).combobox('setValue','001');  
					 }*/
			  }); 
		 }	
	});
}