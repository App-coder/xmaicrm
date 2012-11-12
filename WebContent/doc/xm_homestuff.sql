/*
Navicat MySQL Data Transfer

Source Server         : 易客CRM
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : xmaicrm

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2012-08-08 15:54:44
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `xm_homestuff`
-- ----------------------------
DROP TABLE IF EXISTS `xm_homestuff`;
CREATE TABLE `xm_homestuff` (
  `stuffid` int(19) NOT NULL default '0',
  `stuffsequence` int(19) NOT NULL default '0',
  `stufftype` varchar(100) NOT NULL default '',
  `userid` int(19) NOT NULL,
  `visible` int(10) NOT NULL default '0',
  `stufftitle` varchar(100) default NULL,
  PRIMARY KEY  (`stuffid`,`stufftype`),
  KEY `stuff_stuffid_idx` (`stuffid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xm_homestuff
-- ----------------------------
INSERT INTO xm_homestuff VALUES ('1', '4', 'datelogs', '1', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('1', '10', 'top_potential', '1', '0', '金额较大的销售机会');
INSERT INTO xm_homestuff VALUES ('4', '4', 'top_calendar', '1', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('6', '3', 'note_pad', '1', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('53', '-46', 'free_tags', '1', '0', '标签列表');
INSERT INTO xm_homestuff VALUES ('8', '4', 'user_salesfinishedbymonth', '1', '0', '本人最近3个月销售任务完成情况');
INSERT INTO xm_homestuff VALUES ('9', '5', 'top_notes', '1', '0', '最近联系记录');
INSERT INTO xm_homestuff VALUES ('10', '-3', 'datelogs', '16', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('11', '-4', 'top_salesbymonth', '16', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('12', '-5', 'top_account', '16', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('13', '-6', 'top_calendar', '16', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('14', '-7', 'top_performance', '16', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('15', '-8', 'note_pad', '16', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('16', '-9', 'datelogs', '17', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('17', '-10', 'top_salesbymonth', '17', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('18', '-11', 'top_account', '17', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('19', '-12', 'top_calendar', '17', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('20', '-13', 'top_performance', '17', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('21', '-14', 'note_pad', '17', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('22', '-15', 'datelogs', '18', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('23', '-16', 'top_salesbymonth', '18', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('24', '-17', 'top_account', '18', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('25', '-18', 'top_calendar', '18', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('26', '-19', 'top_performance', '18', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('27', '-20', 'note_pad', '18', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('28', '1', 'key_customview', '1', '0', '关键视图');
INSERT INTO xm_homestuff VALUES ('29', '-22', 'datelogs', '21', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('30', '-23', 'top_salesbymonth', '21', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('31', '-24', 'top_account', '21', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('32', '-25', 'top_calendar', '21', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('33', '-26', 'top_performance', '21', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('34', '-27', 'note_pad', '21', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('35', '-28', 'datelogs', '20', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('36', '-29', 'top_salesbymonth', '20', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('37', '-30', 'top_account', '20', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('38', '-31', 'top_calendar', '20', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('39', '-32', 'top_performance', '20', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('40', '-33', 'note_pad', '20', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('41', '-34', 'datelogs', '19', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('42', '-35', 'top_salesbymonth', '19', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('43', '-36', 'top_account', '19', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('44', '-37', 'top_calendar', '19', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('45', '-38', 'top_performance', '19', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('46', '-39', 'note_pad', '19', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('47', '-40', 'datelogs', '22', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('48', '-41', 'top_salesbymonth', '22', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('49', '-42', 'top_account', '22', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('50', '-43', 'top_calendar', '22', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('51', '-44', 'top_performance', '22', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('52', '-45', 'note_pad', '22', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('1', '1', 'key_customview', '1', '0', '关键视图');
INSERT INTO xm_homestuff VALUES ('1', '6', 'cangkuassets', '1', '0', '库存资产');
INSERT INTO xm_homestuff VALUES ('2', '1', 'user_salesbymonth', '1', '0', '本人最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('1', '4', 'top_salesbymonth', '1', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('2', '1', 'notok_calendar', '1', '0', '过期未完成日程');
INSERT INTO xm_homestuff VALUES ('1', '11', 'salesfunnels', '1', '0', '销售漏斗');
INSERT INTO xm_homestuff VALUES ('1', '3', 'com_gathersfinishedbymonth', '1', '0', '公司最近6个月回款任务完成情况');
INSERT INTO xm_homestuff VALUES ('1', '2', 'gathersyear', '1', '0', '公司应收款月度同比');
INSERT INTO xm_homestuff VALUES ('2', '3', 'datelogs', '1', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('2', '6', 'key_customview', '1', '0', '关键视图');
INSERT INTO xm_homestuff VALUES ('2', '13', 'note_pad', '1', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('2', '8', 'salesfunnels', '1', '0', '销售漏斗');
INSERT INTO xm_homestuff VALUES ('2', '9', 'top_account', '1', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('2', '4', 'top_calendar', '1', '0', '7天内日程');
INSERT INTO xm_homestuff VALUES ('2', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('2', '2', 'top_performance', '1', '0', '个人本月销售数据');
INSERT INTO xm_homestuff VALUES ('2', '11', 'top_quote', '1', '0', '最新报价');
INSERT INTO xm_homestuff VALUES ('2', '12', 'top_salesorder', '1', '0', '最新已审批合同订单');
INSERT INTO xm_homestuff VALUES ('4', '2', 'top_salesbymonth', '1', '0', '公司最近6个月销售情况');
INSERT INTO xm_homestuff VALUES ('4', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('1', '1', 'accountmoney', '1', '0', '应收款、应付款客户汇总');
INSERT INTO xm_homestuff VALUES ('7', '2', 'datelogs', '1', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('7', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('3', '5', 'note_pad', '1', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('3', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('4', '1', 'accountmoney', '1', '0', '应收款、应付款客户汇总');
INSERT INTO xm_homestuff VALUES ('3', '3', 'datelogs', '1', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('2', '7', 'top_potential', '1', '0', '金额较大的销售机会');
INSERT INTO xm_homestuff VALUES ('4', '5', 'expensesmonth', '1', '0', '费用报销（30天内）');
INSERT INTO xm_homestuff VALUES ('4', '3', 'gathersyear', '1', '0', '公司应收款月度同比');
INSERT INTO xm_homestuff VALUES ('1', '1', 'com_salesfinishedbymonth', '1', '0', '公司最近6个月销售任务完成情况');
INSERT INTO xm_homestuff VALUES ('4', '2', 'com_gathersfinishedbymonth', '1', '0', '公司最近6个月回款任务完成情况');
INSERT INTO xm_homestuff VALUES ('4', '3', 'top_salesorder', '1', '0', '最新已审批合同订单');
INSERT INTO xm_homestuff VALUES ('4', '4', 'top_gather', '1', '0', '30天内及过期应收款');
INSERT INTO xm_homestuff VALUES ('5', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('5', '2', 'cangkuassets', '1', '0', '库存资产');
INSERT INTO xm_homestuff VALUES ('5', '5', 'note_pad', '1', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('7', '3', 'note_pad', '1', '0', '记事本(双击内容进入编辑模式)');
INSERT INTO xm_homestuff VALUES ('6', '1', 'announcements', '1', '0', '内部公告');
INSERT INTO xm_homestuff VALUES ('6', '2', 'datelogs', '1', '0', '日/周/月报');
INSERT INTO xm_homestuff VALUES ('6', '3', 'salesfunnels', '1', '0', '销售漏斗');
INSERT INTO xm_homestuff VALUES ('6', '4', 'top_account', '1', '0', '最近联系客户');
INSERT INTO xm_homestuff VALUES ('1', '5', 'salesyear', '1', '0', '公司销售额月度同比');
INSERT INTO xm_homestuff VALUES ('1', '6', 'salesyearinfo', '1', '0', '公司年度销售情况');
INSERT INTO xm_homestuff VALUES ('2', '2', 'top_notes', '1', '0', '最近联系记录');
INSERT INTO xm_homestuff VALUES ('2', '3', 'AccountMemdays', '1', '0', '最近一个月客户纪念日');
INSERT INTO xm_homestuff VALUES ('2', '4', 'sub_performance', '1', '0', '下属本月销售数据');
INSERT INTO xm_homestuff VALUES ('2', '5', 'top_gather', '1', '0', '30天内及过期应收款');
INSERT INTO xm_homestuff VALUES ('2', '6', 'user_salesfinishedbymonth', '1', '0', '本人最近3个月销售任务完成情况');
INSERT INTO xm_homestuff VALUES ('2', '7', 'today_account', '1', '0', '今日待联系客户');
