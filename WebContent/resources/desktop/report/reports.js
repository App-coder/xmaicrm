var month=["年度表","一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"];
var column_name=["人员签署合同明细表","客户回款明细表","人员回款明细表","采购汇总表","毛利明细表","毛利汇总表",
                 "出库汇总表(产品)","出库汇总表(客户)","发货/交付汇总表(产品)","发货/交付汇总表(客户)"];

var reports=[
	      {
	    	  id:'4',
              tbname: column_name[0],
              columns:[[  
                 	   {field:'last_name',title:'人员'},  
                	   {field:'subject',title:'合同名称',
                 		formatter:function(value,row,index){
                		   if (value=='合计')
                			   return '<span style="color:red;">'+value+'</span>';
                		   else
                			   return value;
                		   } 
                 	   },
                	   {field:'accountname',title:'客户名称'},
                	   {field:'total',title:'合同金额'},  
                	   {field:'actualamount',title:'已收款'},
                	   {field:'notamount',title:'未收款'},
                	   {field:'billingamount',title:'开票'}
                       ]]
	      },
	      {
	    	  id:'5',
              tbname: column_name[1],
              columns:[[  
                 	   {field:'accountname',title:'客户名称'},  
                	   {field:'total',title:'合同金额'},
                	   {field:'actualamount',title:'已收款'},
                	   {field:'billingamount',title:'开票'} 
                       ]]
	      },{
	    	  id:'6',
              tbname: column_name[2],
              columns:[[  
                 	   {field:'last_name',title:'人员'},  
                	   {field:'actualdate',title:'收款日期',
                 		formatter:function(value,row,index){
                   		   if (value=='合计')
                   			   return '<span style="color:red;">'+value+'</span>';
                   		   else
                   			   return value;
                   		   } 
                 	   },
                	   {field:'actualamount',title:'收款金额'},
                	   {field:'accountname',title:'客户名称'},  
                	   {field:'subject',title:'合同名称'}
                       ]]
	      },{
	    	  id:'7',
              tbname: column_name[3],
              columns:[[  
                 	   {field:'productname',title:'产品'},  
                	   {field:'duedate',title:'采购日期'},
                	   {field:'quantity',title:'采购数量'},
                	   {field:'listprice',title:'采购单价'},  
                	   {field:'prodtotle',title:'总金额'},
                	   {field:'vendorname',title:'供应商'},
                	   {field:'subject',title:'采购主题'},
                	   {field:'last_name',title:'负责人'},
                	   {field:'notruku',title:'未入库数量'}
                       ]]
	      },{
	    	  id:'8',
              tbname: column_name[4],
              columns:[[  
                 	   {field:'duedate',title:'交付日期'},  
                	   {field:'productname',title:'产品'},
                	   {field:'subject',title:'合同订单'},
                	   {field:'accountname',title:'客户'},  
                	   {field:'quantity',title:'交付数量'},
                	   {field:'invoicetotle',title:'金额'},
                	   {field:'maori',title:'毛利'},
                	   {field:'maorirate',title:'毛利率'}
                       ]]
	      },{
	    	  id:'9',
              tbname: column_name[5],
              columns:[[  
                 	   {field:'productname',title:'产品'},  
                	   {field:'quantity',title:'销售量'},
                	   {field:'invoicetotle',title:'销售额'},
                	   {field:'maori',title:'毛利'},  
                	   {field:'maorirate',title:'毛利率'}
                       ]]
	      },{
	    	  id:'10',
              tbname: column_name[6],
              columns:[[  
                 	   {field:'productname',title:'产品',width:120},  
                	   {field:'cangkuname',title:'仓库',width:50},
                	   {field:'quantity',title:'数量',width:60},
                	   {field:'deliverydate',title:'出库日期',width:50},  
                	   {field:'last_name',title:'负责人',width:50},
                	   {field:'subject',title:'合同订单',width:100},
                	   {field:'invoicesubject',title:'发货单',width:70},
                	   {field:'deliveryname',title:'出库单',width:100},
                	   {field:'accountname',title:'客户名称',width:120}
                       ]]
	      },{
	    	  id:'11',
              tbname: column_name[7],
              columns:[[  
                 	   {field:'accountname',title:'客户名称'},  
                	   {field:'productname',title:'产品'},
                	   {field:'cangkuname',title:'仓库'},
                	   {field:'quantity',title:'数量'},  
                	   {field:'deliverydate',title:'出库日期'},
                	   {field:'last_name',title:'负责人'},
                	   {field:'subject',title:'合同订单'},
                	   {field:'invoicesubject',title:'发货单'},
                	   {field:'deliveryname',title:'出库单'}
                       ]]
	      },{
	    	  id:'12',
              tbname: column_name[8],
              columns:[[  
                 	   {field:'productname',title:'产品'},  
                	   {field:'accountname',title:'客户名称'},
                	   {field:'subject',title:'合同订单'},
                	   {field:'duedate',title:'交付日期'},  
                	   {field:'quantity',title:'数量'},
                	   {field:'listprice',title:'单价'},
                	   {field:'invoicetotle',title:'金额'},
                	   {field:'costprice',title:'成本'},
                	   {field:'maori',title:'毛利'},
                	   {field:'last_name',title:'负责人'},
                	   {field:'invoicesubject',title:'发货单'}
                       ]]
	      },{
	    	  id:'13',
              tbname: column_name[9],
              columns:[[  
                       {field:'accountname',title:'客户'},
                 	   {field:'productname',title:'产品'},  
                	   {field:'subject',title:'合同订单'},
                	   {field:'duedate',title:'交付日期'},  
                	   {field:'quantity',title:'数量'},
                	   {field:'listprice',title:'单价'},
                	   {field:'invoicetotle',title:'金额'},
                	   {field:'costprice',title:'成本'},
                	   {field:'maori',title:'毛利'},
                	   {field:'last_name',title:'负责人'},
                	   {field:'invoicesubject',title:'发货单'}
                       ]]
	      }             
];


