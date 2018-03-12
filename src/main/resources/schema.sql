CREATE TABLE admin(
	 a_id INT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT
	,a_name VARCHAR(20) NOT NULL
	,a_passWord VARCHAR(60) NOT NULL
);

CREATE TABLE user(
	u_id INT(4) NOT NULL PRIMARY KEY AUTO_INCREMENT
	,u_name VARCHAR(50) NOT NULL
	,u_passWord VARCHAR(60) NOT NULL
	,u_phone VARCHAR(50)
	,u_address VARCHAR(255) DEFAULT '地址不详'
	,u_bornDate DATE
	,u_email VARCHAR(50)
	,u_identityCard VARCHAR(18)
	,u_genderId INT NOT NULL
	,enabled boolean not null
);

CREATE TABLE gender(
	 g_id INT(4) NOT NULL PRIMARY KEY AUTO_INCREMENT
	,g_name CHAR(10) NOT NULL UNIQUE
);

ALTER TABLE user
    ADD CONSTRAINT fk_gender_id
    FOREIGN KEY (u_genderId) REFERENCES gender(g_id);

INSERT INTO gender(g_name) VALUES ('男');
INSERT INTO gender(g_name) VALUES ('女');

INSERT INTO admin(a_name, a_passWord) VALUES ('Rain','123');
INSERT INTO admin(a_name, a_passWord) VALUES ('Jean','123');


INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10001','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,true);

INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10002','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,true);

INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10003','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,true);

INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10004','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,true);

INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10005','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,FALSE );

INSERT INTO user(u_name, u_passWord, u_phone, u_address, u_bornDate, u_email, u_identityCard, u_genderId, enabled)
values('10006','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.'
	,'12345678901','北京市','1998-01-01','123@qq.com','123456789012345678',1,FALSE);



CREATE TABLE basicinfo(
	carId INT(4) NOT NULL COMMENT '汽车编号'
	,brand VARCHAR(50) NOT NULL COMMENT '厂商'
	,carGrade VARCHAR(50) NOT NULL COMMENT '汽车级别'
	,engineType VARCHAR(50) NOT NULL COMMENT '发动机'
	,gearbox VARCHAR(50) NOT NULL COMMENT '变速箱'
	,bodywork VARCHAR(50) NOT NULL COMMENT '车身结构'
	,LWH VARCHAR(50) NOT NULL COMMENT '长宽高'
	,wheelbase VARCHAR(50) NOT NULL COMMENT '汽车轴距'
	,cargoVolume VARCHAR(50) NOT NULL COMMENT '行李厢容积'
	,weight VARCHAR(50) NOT NULL COMMENT '整备质量'
);

CREATE TABLE engine(
	engineId INT(4) NOT NULL COMMENT '编号'
	,displacement VARCHAR(50)  COMMENT '排量'
	,AirIntakeForm VARCHAR(50)  COMMENT '进气形式'
	,cylinder VARCHAR(50)  COMMENT '气缸'
	,maxPS VARCHAR(50) NOT NULL COMMENT '最大马力(Ps)'
	,maxNM VARCHAR(50) NOT NULL COMMENT '最大扭矩(N·m)'
	,fuelType VARCHAR(50) NOT NULL COMMENT '燃料类型'
	,FuelLabel VARCHAR(50) NOT NULL COMMENT '燃料标号'
	,OilSupplyWay VARCHAR(50) NOT NULL COMMENT '供油方式'
	,EmissionStandards VARCHAR(50) NOT NULL COMMENT '环保标准'
);

CREATE TABLE driving(
	drivingId INT(4) NOT NULL COMMENT '编号'
	,drivingMethod VARCHAR(50) NOT NULL COMMENT '驱动方式'
	,brakeType VARCHAR(50) NOT NULL COMMENT '驻车制动类型'
	,frontSuspensionType VARCHAR(50) NOT NULL COMMENT '前悬挂类型'
	,rearSuspensionType VARCHAR(50) NOT NULL COMMENT '后轮胎规则'
	,frontbrakingType VARCHAR(50) NOT NULL COMMENT '前制动类型'
	,rearbrakingType VARCHAR(50) NOT NULL COMMENT '后制动类型'
	,parkingBrakeType VARCHAR(50) NOT NULL COMMENT '驻车制动类型'
	,frontTireRule VARCHAR(50) NOT NULL COMMENT '前轮胎规则'
	,rearTireRule VARCHAR(50) NOT NULL COMMENT '前轮胎规则'
);




