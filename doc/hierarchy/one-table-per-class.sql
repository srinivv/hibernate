DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
    `person_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(50) NULL DEFAULT NULL,
    `lastname` VARCHAR(50) NULL DEFAULT NULL,
    `joining_date` DATE NULL DEFAULT NULL,
    `department_name` VARCHAR(50) NULL DEFAULT NULL,
    `discriminator` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`person_id`)
);