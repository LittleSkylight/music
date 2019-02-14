/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.24-log : Database - music
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`music` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `music`;

/*Table structure for table `biz_wangyi_play` */

DROP TABLE IF EXISTS `biz_wangyi_play`;

CREATE TABLE `biz_wangyi_play` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `play_id` varchar(30) NOT NULL COMMENT '网易歌单id',
  `play_name` varchar(100) NOT NULL COMMENT '网易歌单名',
  `status` tinyint(1) DEFAULT '0',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `biz_wangyi_play` */

insert  into `biz_wangyi_play`(`id`,`play_id`,`play_name`,`status`,`create_time`,`update_time`) values (1,'823859606','我喜欢的音乐',1,'2018-03-08 13:25:38','2018-03-08 13:25:38'),(2,'3778678','网易云热歌榜',0,'2018-11-23 11:21:11','2018-11-23 11:21:14'),(3,'2250011882','抖音排行榜',0,'2018-11-23 11:31:09','2018-11-23 11:31:11');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
