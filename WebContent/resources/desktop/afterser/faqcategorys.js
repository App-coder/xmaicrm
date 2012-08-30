$(function(){
	$('#faqcategory_list').treegrid({
		url:'faqcategorys/getFaqCategoryByParentid',
		title:'知识库分类',
		nowrap: true,
		striped: true,
        rownumbers:true,
        idField:'faqcategoryid',
		treeField:'faqcategoryname',
		singleSelect:true,
		queryParams:{pid:1},
		columns:[[
            {title:'分类名称',field:'faqcategoryname',width:200},
			{title:'系统',field:'sortorder',width:150},
			{title:'操作',field:'faqcategoryid',width:250,
				formatter:function(value,rowdata,rowindex){
					return "<span class='iconsp icon-edit' onclick='editCategory("+value+")' title='修改'></span><span class='iconsp icon-remove' title='删除'></span>";
				}	
			}
		]],
		toolbar:[{
			id:'add',
			text:'添加分类',
			iconCls:'icon-add',
			handler:function(){
				$("#addCategory").window({
					onOpen:function(){
						$("#form_faqcategory").find("input[name=action]").val("add");
						$("#parentfaqcategoryid").combotree({
							url:'faqcategorys/getFaqCategory',
							width:250,
							valueField:'id'
						});
					},
					onClose:function(){
						$("#form_faqcategory").find("input[name=sortorder]").val("");
						$("#form_faqcategory").find("input[name=parentfaqcategoryid]").val("");
					}
				});
				$("#addCategory").window("open");
			}
		}],
		onBeforeLoad:function(row,param){
			if(row==null){
				$('#faqcategory_list').treegrid("options").queryParams.pid = 0;
			}else if(row.id!=undefined){
				$('#faqcategory_list').treegrid("options").queryParams.pid = row.id;
			}
		}
	});
	
	$('#form_article_category').form({
		url:"admin/articlecategory/article_category_do",
		onSubmit : function() {
			if($('#form_article_category').form("validate")){
				return true;
			}else{
				return false;
			}
		},
		success : function(data) {
			try{
				data = eval("(" + data + ")");
				if(data.type=="true"){
					closeWin('addCategory');
					$("#articlecategory").datagrid('reload');
				}else{
					error(data.message);
				}
			}catch(e){
				exception();
			}
			
		}
	});
	
	 /*自定义数字验证规则*/
	$.extend($.fn.validatebox.defaults.rules, {   
          numbervalid: {   
	         validator: function(value, param){   
	        	      var patrn=/^\d+$/;
	        	      if(!patrn.exec(value)) return false;
	        	      return true;
	          },   
		          message: '请填写一个数字!'  
		     }   
	 });  
   });
    
   /*var setFormValue = function (item) {
    if (!item) item = {};
   
   };*/

	function addCategory(){
		$('#form_article_category').submit();
	}
	
	function editCategory(id){
		var item=$('#faqcategory_list').treegrid("find",id);
		$("#addCategory").window({
			onOpen:function(){
				$("#form_faqcategory").find("input[name=action]").val("edit");
				$("#form_faqcategory").find("input[name=parentfaqcategoryid]").val(id);
				$("#form_faqcategory").find("input[name=sortorder]").val(item.sortorder);
				$("#form_faqcategory").find("input[name=faqcategoryname]").val(item.faqcategoryname);
				$("#parentfaqcategoryid").combotree({
					url:'faqcategorys/getFaqCategory',
					width:250,
					valueField:'id'
				});
			},
			onClose:function(){
				$("#form_faqcategory").find("input[name=name]").val("");
				$("#form_faqcategory").find("input[name=sortorder]").val("");
				$("#form_faqcategory").find("input[name=parentfaqcategoryid]").val("");
			}
		});
		$("#addCategory").window("open");
	}