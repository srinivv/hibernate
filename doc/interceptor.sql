DROP TABLE IF EXISTS `auditlog`;
CREATE TABLE  `auditlog` (
  `AUDIT_LOG_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ACTION` VARCHAR(100) NOT NULL,
  `DETAIL` text NOT NULL,
  `CREATED_DATE` DATE NOT NULL,
  `ENTITY_ID` BIGINT(20) UNSIGNED NOT NULL,
  `ENTITY_NAME` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`AUDIT_LOG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

CREATE TABLE  `stock` (
  `STOCK_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` VARCHAR(100) NOT NULL,
  `STOCK_NAME` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`STOCK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;