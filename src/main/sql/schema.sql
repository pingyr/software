SHOW DATABASES ;
CREATE DATABASE pingyrsoft;

CREATE TABLE UserInfo(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '',
  name VARCHAR(60) NOT NULL COMMENT '',
  password CHAR(15) NOT NULL COMMENT '',
  email VARCHAR(60) COMMENT '',
  head_image_url VARCHAR(60) COMMENT '',
  create_time TIMESTAMP COMMENT '',
  last_login_time TIMESTAMP COMMENT '最近一次登录时间',
  last_quit_time TIMESTAMP COMMENT '最近一次推出登录时间',
  is_on_line TINYINT(1) COMMENT '账号是否在线'
)ENGINE = InnoDB DEFAULT CHARSET =utf8 COMMENT '';

CREATE TABLE AliyunOSSAccessToken(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '序列号id自增',
  endpoint varchar(60) NOT NULL COMMENT '连接节点端口',
  accessKeyId VARCHAR(60) NOT NULL  COMMENT '',
  accessKeySecret VARCHAR(60) NOT NULL COMMENT '',
  create_time TIMESTAMP NOT NULL COMMENT '创建时间',
  PRIMARY KEY (id),
  KEY idx_AliyunOSSAccessToken_id(id),
  KEY idx_AliyunOSSAccessToken_endpoint(endpoint),
  KEY idx_AliyunOSSAccessToken_accessKeyId(accessKeyId),
  KEY idx_AliyunOSSAccessToken_accessKeySecret(accessKeySecret),
  KEY idx_AliyunOSSAccessToken_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET =utf8 COMMENT ='阿里云OSS存储接口ACCESS KEY';

CREATE TABLE AliyunMNSAccessToken(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '序列号id自增',
  endpoint varchar(60) NOT NULL COMMENT '连接节点端口',
  accessKeyId VARCHAR(60) NOT NULL  COMMENT '',
  accessKeySecret VARCHAR(60) NOT NULL COMMENT '',
  topic_ref VARCHAR(60) NOT NULL COMMENT '',
  free_sign_name VARCHAR(60) NOT NULL COMMENT '短信签名',
  template_name VARCHAR(60) NOT NULL COMMENT '短信模板CODE',
  create_time TIMESTAMP NOT NULL COMMENT '创建时间',
  PRIMARY KEY (id),
  KEY idx_AliyunMNSAccessToken_id(id),
  KEY idx_AliyunMNSAccessToken_endpoint(endpoint),
  KEY idx_AliyunMNSAccessToken_accessKeyId(accessKeyId),
  KEY idx_AliyunMNSAccessToken_accessKeySecret(accessKeySecret),
  KEY idx_AliyunMNSAccessToken_topic_ref(topic_ref),
  KEY idx_AliyunMNSAccessToken_free_sign_name(free_sign_name),
  KEY idx_AliyunMNSAccessToken_template_name(template_name),
  KEY idx_AliyunMNSAccessToken_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET =utf8 COMMENT = '阿里云MNS存储接口ACCESSKEY';