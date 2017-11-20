SHOW DATABASES ;
CREATE DATABASE pingyrsoft;

CREATE TABLE IF NOT EXISTS user_info  (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '注册用户表自增id',
  `u_id` BIGINT(15) NOT NULL COMMENT '用户唯一标识id',
  `name` VARCHAR(120) NOT NULL COMMENT '用户注册名',
  `password` VARCHAR(15) NOT NULL COMMENT '登陆密码',
  `gender` char(2) COMMENT '性别',
  `age` INT COMMENT '年龄',
  `email` VARCHAR(120) COMMENT 'email',
  `invite_code` VARCHAR(15) COMMENT '注册邀请码',
  `create_time` DATETIME NOT NULL COMMENT '注册时间',
  `head_image_url` VARCHAR(120) COMMENT '用户头像',
  PRIMARY KEY (id,u_id),
  KEY idx_user_info_id(id),
  KEY idx_user_info_u_id(u_id),
  KEY idx_user_info_name(name),
  KEY idx_user_info_email(email),
  KEY idx_user_info_create_time(create_time),
  KEY idx_user_info_invite_code(invite_code)
)ENGINE = InnoDB DEFAULT  CHARSET = utf8 COMMENT '注册用户信息表';


CREATE TABLE IF NOT EXISTS suggest_message(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(120) NOT NULL COMMENT 'name',
  `email` VARCHAR(120) COMMENT 'email',
  `subject` VARCHAR(120) COMMENT 'subject',
  `content` VARCHAR(240) COMMENT 'content',
  `create_time` DATETIME NOT NULL COMMENT '主题创建时间',
  `handle_time` DATETIME COMMENT '处理时间',
  PRIMARY KEY (id),
  KEY idx_suggest_message_id(id),
  KEY idx_suggest_message_name(name),
  KEY idx_suggest_message_email(email),
  KEY idx_suggest_message_create_time(create_time),
  KEY idx_suggest_message_handle_time(handle_time)
)ENGINE =InnoDB DEFAULT  CHARSET = utf8 COMMENT '网站建议消息内容表';