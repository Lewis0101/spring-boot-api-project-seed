DROP table if EXISTS `user_info`;
CREATE TABLE `user_info` (
                           `user_id` bigint(20) NOT NULL COMMENT '用户id',
                           `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
                           `password` varchar(50) DEFAULT NULL COMMENT '密码',
                           `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
                           `profile` text COMMENT '简介',
                           `head_portrait` bigint(20) DEFAULT NULL COMMENT '头像',
                           `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                           PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if EXISTS `role_info`;
CREATE TABLE `role_info` (
                           `role_id` bigint(20) NOT NULL COMMENT '角色id',
                           `role_name` varchar(50) DEFAULT NULL COMMENT '角色名',
                           `status` int(2) DEFAULT NULL COMMENT '有效标志',
                           `create_person` bigint(255) DEFAULT NULL COMMENT '创建人',
                           `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                           PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if EXISTS `limits_info`;
CREATE TABLE `limits_info` (
                             `limits_id` bigint(20) NOT NULL COMMENT '权限id',
                             `limits_name` varchar(50) DEFAULT NULL COMMENT '权限名称',
                             `limits_url` varchar(200) DEFAULT NULL COMMENT '权限URL',
                             PRIMARY KEY (`limits_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if EXISTS `role_relation`;
CREATE TABLE `role_relation` (
                               `user_id` bigint(20) NOT NULL COMMENT '用户id',
                               `role_id` bigint(20) NOT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if EXISTS `limits_info`;
CREATE TABLE `limits_info` (
                             `limits_id` bigint(20) NOT NULL COMMENT '权限id',
                             `limits_name` varchar(50) DEFAULT NULL COMMENT '权限名称',
                             `limits_url` varchar(200) DEFAULT NULL COMMENT '权限URL',
                             PRIMARY KEY (`limits_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;