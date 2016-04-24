
DROP TABLE IF EXISTS `employee_colleague`;
DROP TABLE IF EXISTS `employee`;

CREATE TABLE `person` (
	`person_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`firstname` VARCHAR(50) NOT NULL DEFAULT '0',
	`lastname` VARCHAR(50) NOT NULL DEFAULT '0',
	PRIMARY KEY (`person_id`)
);

CREATE TABLE `employee` (
	`person_id` BIGINT(10) NOT NULL,
	`joining_date` DATE NULL DEFAULT NULL,
	`department_name` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`person_id`),
	CONSTRAINT `FK_PERSON` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
);

CREATE TABLE `owner` (
	`person_id` BIGINT(20) NOT NULL DEFAULT '0',
	`stocks` BIGINT(11) NULL DEFAULT NULL,
	`partnership_stake` BIGINT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`person_id`),
	CONSTRAINT `FK_PERSON2` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
);