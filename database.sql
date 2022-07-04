/* 数据库建立 */


create TABLE customer(
id int primary key auto_increment,
name varchar(15),
gender char(1),
age int,
tel varchar(20),
idcardnumber varchar(20),
filenumber varchar(20),
account varchar(20),
password varchar(20),
height int,
birthday date
);
create table staff(
id int primary key auto_increment,
client_name varchar(15),
client_gender char(1),
client_id varchar(15),
client_type char(2),
client_account varchar(20),
client_password varchar(20),
client_tel varchar(11)
);
create table manager(
id int primary key auto_increment,
account varchar(20),
password varchar(20));
create table bedmanage(
id int primary key auto_increment,
roomid int,
buildingid int,
isavailable char(1),
userid int unique,
CONSTRAINT fk_bed_user FOREIGN KEY(userid) REFERENCES customer(id)
);
create table checkinrecord(
id int primary key auto_increment,

bedid int,
checkindate date,
expirationdate date,
attention varchar(20),
checkin_id int unique,
CONSTRAINT fk_checkin_user FOREIGN KEY(checkin_id) REFERENCES customer(id)
);
create table foodrecord(
id int primary key auto_increment,
food varchar(20),
food_id int,
CONSTRAINT fk_food_user FOREIGN KEY(food_id) REFERENCES customer(id)
);
create table outgoing(
id int primary key auto_increment,
outgoingreason varchar(20),
outgoingtime varchar(20),
expectedreturntime varchar(20),
actualreturntime varchar(20),
escort varchar(20),
escorttel varchar(20),
outgoing_id int,
CONSTRAINT fk_outgoing_user FOREIGN KEY(outgoing_id) REFERENCES customer(id)
);
create table retreatrecord(
id  int primary key auto_increment,
retreattime date,

retreatreason varchar(20),
asktime date,
auditperson varchar(20),
auditopinion varchar(20),
retreat_id int unique,
CONSTRAINT fk_retreat_user FOREIGN KEY(retreat_id) REFERENCES customer(id)
);

create table nursinglevel(
id int primary key auto_increment ,
name varchar(20),
state char(1)
);
create table nursingrecord(
id int primary key auto_increment ,
content varchar(200),
startdate date,
enddate date,
record_userid int unique,
record_levelid int,
CONSTRAINT fk_record_user FOREIGN KEY(record_userid) REFERENCES customer(id),
CONSTRAINT fk_record_level FOREIGN KEY(record_levelid) REFERENCES nursinglevel(id)

);
