/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : select_seat

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 30/01/2021 12:31:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for appoint
-- ----------------------------
DROP TABLE IF EXISTS `appoint`;
CREATE TABLE `appoint`  (
  `id` int(0) NOT NULL COMMENT '预约信息id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '预约日期',
  `seat_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '座位号',
  `uid` int(0) NULL DEFAULT NULL COMMENT '选座的用户id',
  `integrate` int(0) NULL DEFAULT NULL COMMENT '本次信誉积分',
  `duration` int(0) NULL DEFAULT NULL COMMENT '本次使用时长（分钟）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of appoint
-- ----------------------------
INSERT INTO `appoint` VALUES (1, '2021-01-05 12:25:49', '1', 1, 20, 60);
INSERT INTO `appoint` VALUES (2, '2021-01-20 12:30:04', '3', 2, 20, 60);

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat`  (
  `id` int(0) NOT NULL COMMENT '座位id，即seat_id',
  `line` int(0) NULL DEFAULT NULL COMMENT '行',
  `row` int(0) NULL DEFAULT NULL COMMENT '列',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of seat
-- ----------------------------
INSERT INTO `seat` VALUES (1, 1, 1);
INSERT INTO `seat` VALUES (2, 1, 2);
INSERT INTO `seat` VALUES (3, 1, 3);
INSERT INTO `seat` VALUES (4, 1, 4);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `sno` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `identity_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号后六位',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '20171308124', '123456', '369852');
INSERT INTO `users` VALUES (2, '20171308125', '123456', '123212');

SET FOREIGN_KEY_CHECKS = 1;
