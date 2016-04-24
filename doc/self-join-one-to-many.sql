DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
	`employee_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
	`firstname` VARCHAR(50) NULL DEFAULT NULL,
	`lastname` VARCHAR(50) NULL DEFAULT NULL,
	`manager_id` BIGINT(20) NULL DEFAULT NULL,
	PRIMARY KEY (`employee_id`),
	CONSTRAINT `FK_MANAGER` FOREIGN KEY (`manager_id`) REFERENCES `employee` (`employee_id`)
);