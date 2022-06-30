package pojo;

import java.sql.Date;

/**
 * 客户入住记录
 */

/*
create table checkinrecord(
id int primary key auto_increment,
bedid int,
checkindate date,
expirationdate date,
attention varchar(20),
checkin_id int unique,
CONSTRAINT fk_checkin_user FOREIGN KEY(checkin_id) REFERENCES customer(id)
);
 */
public class CustomerCheckIn {
    int id;
    int bedId;  //床位
    Date checkInDate;   //入住时间
    Date expirationDate;    //到期时间
    String attention;   //注意事项
    int customerId;     //客户ID（外键）
}
