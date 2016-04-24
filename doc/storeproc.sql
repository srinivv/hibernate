DROP TABLE IF EXISTS `user_master`;
CREATE TABLE `user_master` (
  `uid` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
   `firstname` VARCHAR(20) NOT NULL,
  `lastname` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
);
commit;

--- Store proc


DROP PROCEDURE IF EXISTS SP_MYSQL_HIBERNATE;
DELIMITER $
CREATE PROCEDURE SP_MYSQL_HIBERNATE(IN PARAM1 INT, IN PARAM2 INT, IN PARAM3 VARCHAR(100))
BEGIN
 /*
  * Uncomment below code to get custom row in hibernate.
  * ------------------------------------------------
  * DECLARE X, Y INT DEFAULT 10;
  * DECLARE RESULT INT;
  * SET RESULT = X + Y;
  * SELECT RESULT AS RESULT, 'javaQuery' AS STRING_RESULT; 
  */

  /* Your custom operation */ 
  UPDATE user_master SET Firstname = PARAM3 WHERE UID = 1;
        
  /* Insert record */
  INSERT INTO user_master (Firstname, Lastname) VALUES('Jennifer ', 'Lawrence');

  /* Returns user object (row) */
  SELECT * FROM user_master WHERE UID = 1;
END $
DELIMITER ;