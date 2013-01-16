$(function() {
    initPage();
});
function initPage() {

    $('#tab_list').datagrid({
	url : 'datagrid_data.json',
	sortName : 'code',
	sortOrder : 'desc',
	remoteSort : false,
	idField : 'code',
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ [ {
	    title : '月份',
	    field : 'm'
	}, {
	    title : '2012-01',
	    colspan : 3
	}, {
	    title : '2012-02',
	    colspan : 3
	}, {
	    title : '2012-03',
	    colspan : 3
	} ], [ {
	    title : '用户',
	    field : 'u'
	}, {
	    field : '2',
	    title : '目标',
	    width : 120
	}, {
	    field : 'addr',
	    title : '完成',
	    width : 220
	}, {
	    field : 'col4',
	    title : '%',
	    width : 150
	}, {
	    field : '12',
	    title : '目标',
	    width : 120
	}, {
	    field : '22',
	    title : '完成',
	    width : 220
	}, {
	    field : '221',
	    title : '%',
	    width : 150
	}, {
	    field : 'r2',
	    title : '目标',
	    width : 120
	}, {
	    field : '211',
	    title : '完成',
	    width : 220
	}, {
	    field : '112',
	    title : '%',
	    width : 150
	} ] ],
	pagination : true,
	rownumbers : true
    });

}