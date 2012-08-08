/*
Navicat MySQL Data Transfer

Source Server         : 易客CRM
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : xmaicrm

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2012-08-08 15:54:27
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `xm_homedefault`
-- ----------------------------
DROP TABLE IF EXISTS `xm_homedefault`;
CREATE TABLE `xm_homedefault` (
  `stuffid` int(19) NOT NULL default '0',
  `stufftype` varchar(30) default NULL,
  `stuffsequence` int(19) NOT NULL,
  `stufftitle` varchar(100) default NULL,
  PRIMARY KEY  (`stuffid`),
  KEY `stuff_stuffid_idx` (`stuffid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xm_homedefault
-- ----------------------------
INSERT INTO xm_homedefault VALUES ('1', 'datelogs', '1', '日/周/月报');
INSERT INTO xm_homedefault VALUES ('2', 'key_customview', '2', '关键视图');
INSERT INTO xm_homedefault VALUES ('3', 'top_salesbymonth', '3', '公司最近6个月销售情况');
INSERT INTO xm_homedefault VALUES ('4', 'top_account', '4', '最近联系客户');
INSERT INTO xm_homedefault VALUES ('5', 'top_calendar', '5', '7天内日程');
INSERT INTO xm_homedefault VALUES ('6', 'top_performance', '6', '个人本月销售数据');
INSERT INTO xm_homedefault VALUES ('7', 'note_pad', '7', '记事本');
