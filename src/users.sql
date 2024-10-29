/*
 Navicat Premium Data Transfer

 Source Server         : 8.140.134.167
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : 8.140.134.167:3306
 Source Schema         : hou

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 29/10/2024 21:25:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `pwd` varchar(50) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES (1, 'hou', 29, 'hou', '湖北省武汉市武昌区八一路299号');
INSERT INTO `users` VALUES (2, 'admin', 18, '123456', '北京市海淀区颐和园路5号');
INSERT INTO `users` VALUES (3, '张三', 20, '123', '北京');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
