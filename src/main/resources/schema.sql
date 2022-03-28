CREATE DATABASE `customer` CHARACTER SET utf8mb4 COLLATE utf8mb4_bin


DROP TABLE IF EXISTS `customer`;


CREATE TABLE `customer` (
`id`  bigint NOT NULL ,
`firstName`  varchar(255) NULL ,
`lastName`  varchar(255) NULL ,
`age`  int NULL ,
`address`  varchar(255) NULL ,
PRIMARY KEY (`id`)
);
INSERT INTO `customer` (`id`, `address`) VALUES ('2', '1');
INSERT INTO `customer` (`id`, `address`) VALUES ('1', '1');