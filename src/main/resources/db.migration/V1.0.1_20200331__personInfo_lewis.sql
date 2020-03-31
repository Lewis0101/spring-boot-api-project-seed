DROP table if exists 'person_info';
CREATE TABLE `person_info` if not exists (
                             `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '主键',
                             `name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
                             `age` int(2) DEFAULT NULL COMMENT '年龄',
                             `id_number` varchar(50) DEFAULT NULL COMMENT '身份证号',
                             `card_type` varchar(2) DEFAULT NULL COMMENT '证件类型，1：身份证，2：警官证，3：医保卡',
                             `address` varchar(50) DEFAULT NULL COMMENT '现住址',
                             `register_address` varchar(50) DEFAULT NULL COMMENT '籍贯',
                             `graduated_school` varchar(50) DEFAULT NULL COMMENT '毕业院校',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;