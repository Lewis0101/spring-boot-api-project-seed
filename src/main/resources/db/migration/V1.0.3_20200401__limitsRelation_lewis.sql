DROP table if EXISTS `limits_relation`;
CREATE TABLE `limits_relation` (
                                 `role_id` bigint(20) NOT NULL COMMENT '角色id',
                                 `limit_id` bigint(20) NOT NULL COMMENT '权限id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;