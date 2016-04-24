DROP TABLE IF EXISTS `owner`;
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
    `person_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(50) NOT NULL DEFAULT '0',
    `lastname` VARCHAR(50) NOT NULL DEFAULT '0',
    PRIMARY KEY (`person_id`)
);
 
CREATE TABLE `employee` (
    `person_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(50) NOT NULL,
    `lastname` VARCHAR(50) NOT NULL,
    `joining_date` DATE NULL DEFAULT NULL,
    `department_name` VARCHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (`person_id`)
);
 
CREATE TABLE `owner` (
    `person_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(50) NOT NULL DEFAULT '0',
    `lastname` VARCHAR(50) NOT NULL DEFAULT '0',
    `stocks` BIGINT(11) NULL DEFAULT NULL,
    `partnership_stake` BIGINT(11) NULL DEFAULT NULL,
    PRIMARY KEY (`person_id`)
);