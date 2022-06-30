package pojo;

import java.sql.Date;

/**
 * 护理记录
 */

/*
create table nursingrecord(
id int primary key auto_increment ,
content varchar(20),
record_userid int unique,
record_levelid int,
CONSTRAINT fk_record_user FOREIGN KEY(record_userid) REFERENCES customer(id),
CONSTRAINT fk_record_level FOREIGN KEY(record_levelid) REFERENCES nursinglevel(id)

);
 */

public class NursingRecord {
    /*
    TODO
     前端要删除一部分
     */
    int id;
    String content; //内容
    Date start; //开始时间
    Date end; //结束时间
    int userId;  //与顾客的外键
    int levelId; //与等级的外键
}
