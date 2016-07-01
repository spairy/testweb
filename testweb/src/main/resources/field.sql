CREATE TABLE `field` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`fieldtype_id` INT(11) NOT NULL,
	`name` VARCHAR(50) NOT NULL,
	`rule_id` VARCHAR(50) NOT NULL,
	`remark` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
