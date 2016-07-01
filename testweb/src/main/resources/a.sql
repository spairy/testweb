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


-- Dumping structure for table testweb.field
CREATE TABLE IF NOT EXISTS `field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fieldtype_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `rule_id` varchar(50) NOT NULL,
  `remark` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.field: ~0 rows (approximately)
/*!40000 ALTER TABLE `field` DISABLE KEYS */;
/*!40000 ALTER TABLE `field` ENABLE KEYS */;


-- Dumping structure for table testweb.fieldtype
CREATE TABLE IF NOT EXISTS `fieldtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  `remark` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.fieldtype: ~0 rows (approximately)
/*!40000 ALTER TABLE `fieldtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `fieldtype` ENABLE KEYS */;


-- Dumping structure for table testweb.page
CREATE TABLE IF NOT EXISTS `page` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  `path` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.page: ~0 rows (approximately)
/*!40000 ALTER TABLE `page` DISABLE KEYS */;
INSERT INTO `page` (`id`, `name`, `path`) VALUES
	(1, 'homepage', 'https://www.cathaypacific.com/cx/en_HK.html');
/*!40000 ALTER TABLE `page` ENABLE KEYS */;


-- Dumping structure for table testweb.pagefield
CREATE TABLE IF NOT EXISTS `pagefield` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pagelist_id` int(11) NOT NULL DEFAULT '0',
  `order` int(11) NOT NULL DEFAULT '0',
  `xpath` varchar(255) NOT NULL DEFAULT '0',
  `field_id` varchar(50) NOT NULL DEFAULT '0',
  `value` varchar(50) NOT NULL DEFAULT '0',
  `variable` varchar(50) NOT NULL DEFAULT '0',
  `remark` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.pagefield: ~0 rows (approximately)
/*!40000 ALTER TABLE `pagefield` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagefield` ENABLE KEYS */;


-- Dumping structure for table testweb.rule
CREATE TABLE IF NOT EXISTS `rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.rule: ~0 rows (approximately)
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;


-- Dumping structure for table testweb.value
CREATE TABLE IF NOT EXISTS `value` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table testweb.value: ~0 rows (approximately)
/*!40000 ALTER TABLE `value` DISABLE KEYS */;
/*!40000 ALTER TABLE `value` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
