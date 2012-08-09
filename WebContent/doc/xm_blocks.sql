/*
Navicat MySQL Data Transfer

Source Server         : 易客CRM
Source Server Version : 50051
Source Host           : localhost:3306
Source Database       : xmaicrm

Target Server Type    : MYSQL
Target Server Version : 50051
File Encoding         : 65001

Date: 2012-09-06 11:55:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `xm_blocks`
-- ----------------------------
DROP TABLE IF EXISTS `xm_blocks`;
CREATE TABLE `xm_blocks` (
  `blockid` int(19) NOT NULL,
  `tabid` int(19) NOT NULL,
  `blocklabel` varchar(100) NOT NULL,
  `sequence` int(10) default NULL,
  `show_title` int(2) default NULL,
  `visible` int(2) NOT NULL default '0',
  `create_view` int(2) NOT NULL default '0',
  `edit_view` int(2) NOT NULL default '0',
  `detail_view` int(2) NOT NULL default '0',
  PRIMARY KEY  (`blockid`),
  KEY `block_tabid_idx` (`tabid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xm_blocks
-- ----------------------------
INSERT INTO xm_blocks VALUES ('1', '2', '销售机会信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('2', '2', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('3', '2', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('4', '4', '联系人信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('5', '4', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('7', '4', '地址信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('8', '4', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('9', '6', '信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('10', '6', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('11', '6', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('12', '6', '描述信息', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('13', '7', '领导信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('14', '7', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('15', '7', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('16', '7', '描述信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('17', '8', '联系记录信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('18', '8', '', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('19', '9', '任务信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('20', '9', '', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('21', '10', '邮箱信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('22', '10', '', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('23', '10', '', '3', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('24', '10', '', '4', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('25', '13', '报修单信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('26', '13', '', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('27', '13', '自定义信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('28', '13', '描述信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('29', '13', '解决方案信息', '5', '0', '0', '1', '0', '0');
INSERT INTO xm_blocks VALUES ('30', '13', '评论', '6', '0', '0', '1', '0', '0');
INSERT INTO xm_blocks VALUES ('31', '14', '产品信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('32', '14', '价格信息:', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('33', '14', '库存信息:', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('34', '14', '自定义信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('35', '14', '产品图片信息:', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('36', '14', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('37', '15', '知识库信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('38', '15', '', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('39', '15', '', '3', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('40', '15', '评论信息', '4', '0', '0', '1', '0', '0');
INSERT INTO xm_blocks VALUES ('41', '16', '日程安排信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('42', '16', '自定义信息', '2', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('43', '16', '描述信息', '3', '1', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('44', '18', '供应商信息:', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('45', '18', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('46', '18', '地址信息:', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('47', '18', '描述信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('48', '19', '价目表信息:', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('49', '19', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('50', '19', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('51', '20', '报价单信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('52', '20', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('53', '20', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('54', '20', '产品详细信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('55', '20', '条件和条款', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('56', '20', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('57', '21', '进货单信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('58', '21', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('59', '21', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('60', '21', '产品详细信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('61', '21', '条件和条款', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('62', '21', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('63', '22', '合同订单信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('64', '22', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('65', '22', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('66', '22', '产品详细信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('67', '22', '条件和条款', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('68', '22', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('69', '23', '发货单信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('70', '23', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('71', '23', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('72', '23', '产品详细信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('73', '23', '条件和条款', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('74', '23', '描述信息', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('75', '4', '产品图片信息:', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('76', '26', '营销活动信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('77', '26', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('78', '26', '预期 & 实际', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('79', '29', '用户登陆和角色', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('80', '29', '更多信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('81', '29', '地址信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('82', '26', '描述信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('83', '29', '用户照片', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('84', '6', '银行财务信息', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('94', '33', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('95', '33', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('96', '33', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('97', '34', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('98', '34', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('99', '34', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('100', '35', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('101', '35', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('102', '35', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('103', '37', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('104', '37', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('105', '37', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('106', '39', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('107', '39', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('108', '39', '关怀内容', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('109', '39', '客户反馈', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('110', '39', '描述信息', '5', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('111', '40', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('112', '40', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('113', '40', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('114', '41', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('115', '41', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('116', '41', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('117', '46', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('118', '46', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('119', '46', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('120', '53', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('121', '53', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('122', '53', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('123', '54', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('124', '54', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('125', '54', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('126', '57', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('127', '57', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('128', '57', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('129', '59', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('130', '59', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('131', '59', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('132', '61', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('133', '61', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('134', '61', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('135', '62', '优势', '4', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('136', '62', ' 竞争产品/方案', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('137', '62', '备注信息', '8', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('138', '62', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('139', '62', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('140', '62', '劣势', '6', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('141', '62', '应对策略', '7', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('142', '63', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('143', '63', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('144', '63', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('145', '6', '联系信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('146', '69', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('147', '69', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('148', '69', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('149', '70', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('150', '70', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('151', '70', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('152', '72', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('153', '72', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('154', '72', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('155', '76', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('156', '76', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('157', '76', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('158', '77', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('159', '77', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('160', '77', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('161', '79', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('162', '79', '自定义信息', '2', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('163', '79', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('164', '82', '描述信息', '3', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('165', '82', '基本信息', '1', '0', '0', '0', '0', '0');
INSERT INTO xm_blocks VALUES ('166', '82', '自定义信息', '2', '0', '0', '0', '0', '0');
