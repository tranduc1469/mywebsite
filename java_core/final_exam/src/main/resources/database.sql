DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

-- Create table user
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id 				INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    full_name 		VARCHAR(50) NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
    `password`		VARCHAR(12) NOT NULL DEFAULT '123456',
    exp_in_year		TINYINT UNSIGNED,
    pro_skill		VARCHAR(50) DEFAULT 'Java',
    `role`			ENUM('EMPLOYEE','ADMIN') NOT NULL DEFAULT 'EMPLOYEE'
);