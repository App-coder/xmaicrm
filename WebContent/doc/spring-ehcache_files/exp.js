(function($){
	$.expBlock = {};
	var 
		//表情图片树的json格式
		EXP_DATA = [
					{
						name: '兔斯基①',
						icons:[
							{url:"/template/js/exp/tusiji/1.gif",title:"想飞"},
							{url:"/template/js/exp/tusiji/2.gif",title:"哭"},
							{url:"/template/js/exp/tusiji/3.gif",title:"搞恶"},
							{url:"/template/js/exp/tusiji/4.gif",title:"跳舞左"},
							{url:"/template/js/exp/tusiji/5.gif",title:"跳舞右"},
							{url:"/template/js/exp/tusiji/6.gif",title:"四星"},
							{url:"/template/js/exp/tusiji/7.gif",title:"张望"},
							{url:"/template/js/exp/tusiji/8.gif",title:"练手"},
							{url:"/template/js/exp/tusiji/9.gif",title:"练武"},
							{url:"/template/js/exp/tusiji/10.gif",title:"汗"},
							{url:"/template/js/exp/tusiji/11.gif",title:"顶墙"},
							{url:"/template/js/exp/tusiji/12.gif",title:"吃"},
							{url:"/template/js/exp/tusiji/13.gif",title:"跳舞"},
							{url:"/template/js/exp/tusiji/14.gif",title:"双手舞动"},
							{url:"/template/js/exp/tusiji/15.gif",title:"插你"},
							{url:"/template/js/exp/tusiji/16.gif",title:"无奈"},
							{url:"/template/js/exp/tusiji/17.gif",title:"得瑟"},
							{url:"/template/js/exp/tusiji/18.gif",title:"杯具"},
							{url:"/template/js/exp/tusiji/19.gif",title:"耍赖"},
							{url:"/template/js/exp/tusiji/20.gif",title:"砸砖"},
							{url:"/template/js/exp/tusiji/21.gif",title:"听音乐"}
							
						]
					},
					{
						name: '兔斯基②',
						icons:[
							
							{url:"/template/js/exp/tusiji/22.gif",title:"甩头"},
							{url:"/template/js/exp/tusiji/23.gif",title:"甩手舞"},
							{url:"/template/js/exp/tusiji/24.gif",title:"飞天"},
							{url:"/template/js/exp/tusiji/25.gif",title:"给力"},
							{url:"/template/js/exp/tusiji/26.gif",title:"蹭瓶"},
							{url:"/template/js/exp/tusiji/27.gif",title:"睡觉"},
							{url:"/template/js/exp/tusiji/28.gif",title:"你不行"},
							{url:"/template/js/exp/tusiji/29.gif",title:"摇你的头"},
							{url:"/template/js/exp/tusiji/30.gif",title:"砸你的头"},
							{url:"/template/js/exp/tusiji/31.gif",title:"桌上睡觉"},
							{url:"/template/js/exp/tusiji/32.gif",title:"耳朵燃烧"},
							{url:"/template/js/exp/tusiji/33.gif",title:"亲亲你"},
							{url:"/template/js/exp/tusiji/34.gif",title:"哼"},
							{url:"/template/js/exp/tusiji/35.gif",title:"上课困"},
							{url:"/template/js/exp/tusiji/36.gif",title:"顶"},
							{url:"/template/js/exp/tusiji/37.gif",title:"拳击"},
							{url:"/template/js/exp/tusiji/38.gif",title:"踹你"},
							{url:"/template/js/exp/tusiji/39.gif",title:"开场"},
							{url:"/template/js/exp/tusiji/40.gif",title:"淋雨"},
							{url:"/template/js/exp/tusiji/41.gif",title:"弹耳朵"},
							{url:"/template/js/exp/tusiji/42.gif",title:"发神经"}
						]
					},
					{
						name: '兔斯基③',
						icons:[
							{url:"/template/js/exp/tusiji/43.gif",title:"献丑"},
							{url:"/template/js/exp/tusiji/44.gif",title:"偷笑"},
							{url:"/template/js/exp/tusiji/45.gif",title:"板凳砸你"},
							{url:"/template/js/exp/tusiji/46.gif",title:"关你"},
							{url:"/template/js/exp/tusiji/47.gif",title:"摇头"},
							{url:"/template/js/exp/tusiji/48.gif",title:"享受音乐"},
							{url:"/template/js/exp/tusiji/49.gif",title:"问"},
							{url:"/template/js/exp/tusiji/50.gif",title:"扭屁股"},
							{url:"/template/js/exp/tusiji/51.gif",title:"跑步1"},
							{url:"/template/js/exp/tusiji/52.gif",title:"跑步2"},
							{url:"/template/js/exp/tusiji/53.gif",title:"芭蕾舞"},
							{url:"/template/js/exp/tusiji/54.gif",title:"走开"},
							{url:"/template/js/exp/tusiji/55.gif",title:"消失"},
							{url:"/template/js/exp/tusiji/56.gif",title:"球表演"},
							{url:"/template/js/exp/tusiji/57.gif",title:"撞墙"},
							{url:"/template/js/exp/tusiji/58.gif",title:"你耍赖"},
							{url:"/template/js/exp/tusiji/59.gif",title:"街舞表演"},
							{url:"/template/js/exp/tusiji/60.gif",title:"绑架"},
							{url:"/template/js/exp/tusiji/61.gif",title:"双手甩鞭"},
							{url:"/template/js/exp/tusiji/62.gif",title:"笔插你"},
							{url:"/template/js/exp/tusiji/63.gif",title:"撞头"}
							
						]
					}
				],
		//图片数组，用于表情从代号到图片的便捷转化
		IMGS_DATA = [],		
		//表情的控制参数
		expEnable = true,
		//配置
		config = {
			//用户表情结构数据
			expData: null,
			//包含textarea和表情触发的exp-holder
			holder: '.postComments',
			//exp-holder中的textarea输入dom，默认为textarea
			textarea : 'textarea',
			//触发dom
			trigger : '.postComments-trigger',
			//每页显示表情的组数
			grpNum : 5,
			//位置相对页面固定(absolute)||窗口固定(fixed)
			posType : 'absolute',
			//表情层数
			zIndex : '100'
		},
		//矫正插件位置偏离
		pos_correct_left = 30,
		//关闭triggerpos_correct_left
		exp_close_tri = '.exp-close',
		//group panel可容纳的最发group数量
		grp_num_per_panel = 1,
		win = window || document,
		bd = 'body';
	
	/**
	 * 初始化表情插件
	 */
	function init(cfg){
		//参数整合
		$.extend(config,cfg);
		if(config.expData != null) EXP_DATA = config.expData;
		_getImgData();
		var triggers = $(config.trigger);
		
		triggers.each(function(){
			$(this).bind('click',function(){
				//大量参数预定义,获取
				var me = $(this),
					holder = $(me.parents(config.holder)[0]),
					ta = $(holder.find(config.textarea)[0]),
					exp = $(_genrt_html()),
					off = me.offset(), me_l = off.left - 50, me_t = off.top, me_w = me.width(), me_h = me.height(),
					exp_t = me_t + me_h, exp_l = me_l + (me_w + pos_correct_left)/2,
					exp_close = exp.find(exp_close_tri),
					exp_sub_tab = exp.find('.exp-sub-tab'), sub_tab_items = exp_sub_tab.children('.group-name'), sub_tab_pre = exp_sub_tab.find('.pre'),sub_tab_next = exp_sub_tab.find('.next'), curGroup = null,
					grpCnt = EXP_DATA.length,
					grpPgCnt = (function(){
						var p = Math.floor(grpCnt / config.grpNum);
						if(grpCnt % config.grpNum != 0){
							return p +1;
						}else{
							return p;
						}
					})(), curGrpPg = 1,
					expUl = exp.find('.exp-detail');
					
				//功能函数准备	
				var 
					/**
					 * 显示第i组的表情
					 */
					showXGroupExp = function(i){
						var expList = '', listDOM;
						if(curGroup != null && curGroup != i){
							sub_tab_items.eq(curGroup).removeClass('slct');
							curGroup = i;
							sub_tab_items.eq(i).addClass('slct');
							sub_tab_items.eq(i).addClass('slct');
							for(var j = 0; j < EXP_DATA[i].icons.length; j++){
								expList += '<li action-data="['+EXP_DATA[i].icons[j].title+']"><img width=\'48px;\' height=\'48px;\' title="'+EXP_DATA[i].icons[j].title+'" alt="'+EXP_DATA[i].icons[j].title+'" src="'+EXP_DATA[i].icons[j].url+'"></li>';
							}
							listDOM = $(expList);
							//alert(listDOM.length);
							listDOM.each(function(){
								$(this).click(function(){
									var me = $(this), actData = me.attr('action-data'),taVal = ta.val();
									ta.val(taVal+actData);
									$(bd).unbind('click');
									me.unbind('mouseout');
									$(win).unbind('resize');
									exp.remove();
								});
							});
							expUl.children().remove();
							expUl.append(listDOM);
						}
						else if(curGroup == null){
							curGroup = i;
							sub_tab_items.eq(i).addClass('slct');
							for(var j = 0; j < EXP_DATA[i].icons.length; j++){
								expList += '<li action-data="['+EXP_DATA[i].icons[j].title+']"><img title="'+EXP_DATA[i].icons[j].title+'" alt="'+EXP_DATA[i].icons[j].title+'" src="'+EXP_DATA[i].icons[j].url+'"></li>';
							}
							listDOM = $(expList);
							//alert(listDOM.length);
							listDOM.each(function(){
								$(this).click(function(){
									var me = $(this), actData = me.attr('action-data'),taVal = ta.val();
									ta.val(taVal+actData);
									$(bd).unbind('click');
									me.unbind('mouseout');
									$(win).unbind('resize');
									exp.remove();
								});
							});
							expUl.children().remove();
							expUl.append(listDOM);
						}else if(curGroup !=null && curGroup == i){
						}
					},
					/**
					 * 显示第i页的group
					 */
					showGrp = function(i){
						var range = {};
						range.left = (i-1)*config.grpNum;
						range.left = Math.max(0,range.left);
						range.right = (i)*config.grpNum - 1;
						range.right = Math.min(range.right,grpCnt-1);
						sub_tab_items.hide();
						for(var j = range.left; j <= range.right; j++){
							sub_tab_items.eq(j).show();
						}
						curGrpPg  = i;
						
						
						if(curGrpPg == 1){
							sub_tab_pre.addClass('pre-disable');
						}
						else{
							sub_tab_pre.removeClass('pre-disable');
						}
						if(curGrpPg >= grpPgCnt){
							sub_tab_next.addClass('next-disalbe');
						}
						else{
							sub_tab_next.removeClass('next-disalbe');
						}
						
					};
					
				if(config.posType == 'fixed'){
					me_t = off.top - $(win).scrollTop();
					exp_t = me_t + me_h;
				}

				//如果允许表情
				if(expEnable){
					//确定表情插件的位置
					exp.css({position: config.posType, zIndex: config.zIndex, left:exp_l+'px', top: exp_t+'px'});
					//窗口重置时重新调整插件位置
					$(win).resize(function(){
						off = me.offset(), me_l = off.left - 50, me_t = off.top;
						exp_t = me_t + me_h, exp_l = me_l + (me_w + pos_correct_left)/2;
						exp.css({left:exp_l+'px', top: exp_t+'px'});
					});
					
					/*各种事件绑定*/
					
					//关闭X事件
					exp_close.click(function(){
						$(bd).unbind('click');
						me.unbind('mouseout');
						$(win).unbind('resize');
						exp.remove();
					});
					
					//trigger的鼠标移出事件（点击之后就删除）
					me.mouseout(function(){
						$(bd).click(function(e){
							var clickDOM = $(e.target);
							var a = clickDOM.parents('.exp-layer');
							if(!a.hasClass('exp-layer')){
								exp.remove();
								$(bd).unbind('click');
								me.unbind('mouseout');
								$(win).unbind('resize');
							}
						})
					});
					
					showGrp(1);
					//设置group—panel的翻页切换事件
					sub_tab_pre.click(function(){
						var p = curGrpPg -1, rg;
						p = (p < 1)?1 : p;
						showGrp(p);
						
					});
					sub_tab_next.click(function(){
						var p = curGrpPg + 1, rg;
						p = (p > grpPgCnt)? curGrpPg : p;
							showGrp(p);
						
					})
					
					//默认打开第一组表情
					showXGroupExp(0);
					//group点击事件
					sub_tab_items.each(function(){
						$(this).click(function(){
							var me = $(this), groupIndex = me.attr('grp-index');
							showXGroupExp(groupIndex);
						});
					});
					
					
					//往页面插入dom
					$('body').append(exp);
					exp.show();
				}
			});
		})
	}
	/**
	 * 使所有的添加了表情触发类的click事件在表情上失效
	 */
	function disableExp(){
		expEnable = false;
	}
	/**
	 * 重新启用表情
	 */
	function enableExp(){
		expEnable = true;
	}
	/**
	 * 获取远程表情的数据结构，必须返回符合规定数据格式的json数据，ajax形式传入
	 * 数据格式如：[{name: groupname,icons:[{url:'imgurl',title:"iconname"},{url:'imgurl',title:"iconname"}]},{name: groupname,icons:[{url:'imgurl',title:"iconname"},{url:'imgurl',title:"iconname"}]},...]
	 */
	function getRemoteNewExp(data_url){
		$.ajax({
			url: data_url,
			success : function(data){
				EXP_DATA = eval(data);
				_getImgData();
			},
			error: function(){
				('传入的url错误');
			}
		})
	}
	
	/**
	 * 将字符串中的表情代号以图片标签代替
	 */
	function textFormat(str){
		var reg = /\[([^\]\[\/ ]+)\]/g,
			src = str,
			rslt,
			temp;
		_getImgData();
		while(temp =reg.exec(src)){
			var s = _switchImg(temp[1]),
				creg,
				t =  "\\[("+temp[1]+")\\]" ; 
			creg = new RegExp(t,"g");
			if(src.match(temp[0]) && s != temp[1]){
				src = src.replace(creg,s);
			}
		}
		return src;	
	}
	//私有函数
	
	/**
	 * 生成表情的html代码
	 */
	function _genrt_html(){
		var html = '<div class="exp-layer"><div class="holder"><div class="content"><div class="exp-tab clearfix"><a href="javascript:;">经典表情</a></div><div class="exp-sub-tab clearfix">';
		for(var i = 0; i < EXP_DATA.length; i++){
			
				html += '<a class="group-name" grp-index="'+i+'" href="javascript:;">'+ EXP_DATA[i].name+'</a>';
		}
		html += '<div class="sub-tab-pagination"><a class="pre"></a><a class="next"></a></div></div><ul class="exp-detail clearfix">';
		/*
		for(var j = 0; j < EXP_DATA[0].icons.length; j++){
					html += '<li action-data="['+EXP_DATA[0].icons[i].title+']"><img title="'+EXP_DATA[0].icons[i].title+'" alt="'+EXP_DATA[0].icons[i].title+'" src="'+EXP_DATA[0].icons[i].url+'"></li>';
				}*/
		
		html +='</ul></div><a class="exp-close" href="javascript:;"></a></div><a class="exp-tri" href="javascript:;"></a></div>';
		return html;
	}
	
	/**
	 * 图片转换，目的是将表情代号转化成图片地址
	 * 如:[微笑] == > <img src='smile.png' />
	 */
	function _switchImg(str){
		for(var i = 0; i < IMGS_DATA.length; i++){
			if(IMGS_DATA[i].title == str){
				return '<img src="'+IMGS_DATA[i].url+'"  />';
			}
		}
		return str;
	}
	
	/**
	 * 集中生成图片数据,根据EXP_DATA生成提取里面的图片数组
	 */
	function _getImgData(){
		for(var i = 0 ; i < EXP_DATA.length; i++){
			IMGS_DATA.push(EXP_DATA[i].icons);
			for(var j = 0; j < EXP_DATA[i].icons.length; j++){
				IMGS_DATA.push(EXP_DATA[i].icons[j]);
			}
		}
	}
		
	//扩展到jquery
	$.expBlock = {
			initExp : init,
			disableExp : disableExp,
			enableExp : enableExp,
			getRemoteExp : getRemoteNewExp,
			textFormat : textFormat
	};
				
})(jQuery)
