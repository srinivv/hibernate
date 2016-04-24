-- Create person table.

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `person_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `age` INT(10) NOT NULL,
  `firstname` VARCHAR(20) NOT NULL,
  `lastname` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`person_id`) USING BTREE
);
commit;

-- Create event table.

DROP TABLE IF EXISTS `events`;
CREATE TABLE `events` (
  `event_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NOT NULL,
  `event_date` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`event_id`) USING BTREE
);
commit;