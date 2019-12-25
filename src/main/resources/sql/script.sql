CREATE TABLE `student` (
                           `id` INT(11) NOT NULL auto_increment,
                           `city` VARCHAR(255) NULL DEFAULT NULL,
                           `name` VARCHAR(255) NULL DEFAULT NULL,
                           PRIMARY KEY (`id`)
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB;