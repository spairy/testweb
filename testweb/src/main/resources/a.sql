-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.5.5-10.0.16-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for testweb
CREATE DATABASE IF NOT EXISTS `testweb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `testweb`;


-- Dumping structure for table testweb.case
DROP TABLE IF EXISTS `case`;
CREATE TABLE IF NOT EXISTS `case` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `page_id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL DEFAULT '',
  `remark` varchar(50) NOT NULL DEFAULT '',
  `status` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.case: ~5 rows (approximately)
DELETE FROM `case`;
/*!40000 ALTER TABLE `case` DISABLE KEYS */;
INSERT INTO `case` (`id`, `page_id`, `name`, `remark`, `status`) VALUES
	(1, 1, 'homepage normal', 'normal test', ''),
	(2, 1, 'homepage error', 'error test', ''),
	(3, 2, 'insert field', 'normal', ''),
	(4, 3, 'insert value', 'normal', ''),
	(5, 4, 'insert rule', 'normal', '');
/*!40000 ALTER TABLE `case` ENABLE KEYS */;


-- Dumping structure for table testweb.field
DROP TABLE IF EXISTS `field`;
CREATE TABLE IF NOT EXISTS `field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` char(1) NOT NULL DEFAULT '',
  `name` varchar(50) NOT NULL DEFAULT '',
  `rules` varchar(50) NOT NULL DEFAULT '',
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.field: ~3 rows (approximately)
DELETE FROM `field`;
/*!40000 ALTER TABLE `field` DISABLE KEYS */;
INSERT INTO `field` (`id`, `type`, `name`, `rules`, `remark`) VALUES
	(1, 'T', 'familyName', 'length(50)', ''),
	(2, 'T', 'givenName', 'length(50)', ''),
	(3, 'B', 'button', '', '');
/*!40000 ALTER TABLE `field` ENABLE KEYS */;


-- Dumping structure for table testweb.page
DROP TABLE IF EXISTS `page`;
CREATE TABLE IF NOT EXISTS `page` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `path` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.page: ~5 rows (approximately)
DELETE FROM `page`;
/*!40000 ALTER TABLE `page` DISABLE KEYS */;
INSERT INTO `page` (`id`, `name`, `path`) VALUES
	(1, 'homepage', 'http://lcoalhost:8080/testweb/index.html'),
	(2, 'casepage', 'http://localhost:8080/testweb/pages/case.html'),
	(3, 'steplpage', 'http://localhost:8080/testweb/pages/step.html'),
	(4, 'valuepage', 'http://localhost:8080/testweb/pages/value.html'),
	(5, 'rulepage', 'http://localhost:8080/testweb/pages/rule.html');
/*!40000 ALTER TABLE `page` ENABLE KEYS */;


-- Dumping structure for table testweb.pagefield
DROP TABLE IF EXISTS `pagefield`;
CREATE TABLE IF NOT EXISTS `pagefield` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `page_id` int(11) NOT NULL DEFAULT '0',
  `xpath` varchar(255) NOT NULL DEFAULT '',
  `field_id` varchar(50) NOT NULL DEFAULT '',
  `page_rules` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.pagefield: ~3 rows (approximately)
DELETE FROM `pagefield`;
/*!40000 ALTER TABLE `pagefield` DISABLE KEYS */;
INSERT INTO `pagefield` (`id`, `page_id`, `xpath`, `field_id`, `page_rules`) VALUES
	(1, 1, '//*[@id="familyName"]', '1', ''),
	(2, 1, '//*[@id="givenName"]', '2', ''),
	(3, 1, '//*[@id="button"]', '3', '');
/*!40000 ALTER TABLE `pagefield` ENABLE KEYS */;


-- Dumping structure for table testweb.result
DROP TABLE IF EXISTS `result`;
CREATE TABLE IF NOT EXISTS `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value_id` int(11) NOT NULL DEFAULT '0',
  `type` varchar(50) NOT NULL DEFAULT '',
  `xpath` varchar(255) NOT NULL DEFAULT '',
  `error` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.result: ~1 rows (approximately)
DELETE FROM `result`;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` (`id`, `value_id`, `type`, `xpath`, `error`) VALUES
	(1, 1, 'error', '//*[@id="familyNameError"]', 'length error');
/*!40000 ALTER TABLE `result` ENABLE KEYS */;


-- Dumping structure for table testweb.rule
DROP TABLE IF EXISTS `rule`;
CREATE TABLE IF NOT EXISTS `rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `remark` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.rule: ~1 rows (approximately)
DELETE FROM `rule`;
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
INSERT INTO `rule` (`id`, `name`, `remark`) VALUES
	(1, 'length(int)', 'length >= 0 && length <= int'),
	(2, 'length(int0, int1)', 'length >= int0 && length <= int1');
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;


-- Dumping structure for table testweb.step
DROP TABLE IF EXISTS `step`;
CREATE TABLE IF NOT EXISTS `step` (
  `case_id` int(11) NOT NULL DEFAULT '0',
  `order` int(11) NOT NULL DEFAULT '0',
  `pagefield_id` int(11) NOT NULL DEFAULT '0',
  `value_id` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.step: ~3 rows (approximately)
DELETE FROM `step`;
/*!40000 ALTER TABLE `step` DISABLE KEYS */;
INSERT INTO `step` (`case_id`, `order`, `pagefield_id`, `value_id`) VALUES
	(1, 1, 1, 1),
	(1, 2, 2, 2),
	(1, 3, 3, 0);
/*!40000 ALTER TABLE `step` ENABLE KEYS */;


-- Dumping structure for table testweb.value
DROP TABLE IF EXISTS `value`;
CREATE TABLE IF NOT EXISTS `value` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `field_id` int(11) NOT NULL DEFAULT '0',
  `value` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.value: ~2 rows (approximately)
DELETE FROM `value`;
/*!40000 ALTER TABLE `value` DISABLE KEYS */;
INSERT INTO `value` (`id`, `field_id`, `value`) VALUES
	(1, 1, 'sun'),
	(2, 2, 'yongayongbyongcyongdyongeyongfyonggyonghyongiyongjyongkyonglyongmyongn');
/*!40000 ALTER TABLE `value` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
