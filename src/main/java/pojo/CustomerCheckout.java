package pojo;

import java.sql.Date;

/**
 * 客户退住记录
 */

/*
create table retreatrecord(
id  int primary key auto_increment,
retreattime date,
retreattype varchar(20),
retreatreason varchar(20),
asktime date,
auditperson varchar(20),
auditopinion varchar(20),
retreat_id int unique,
CONSTRAINT fk_retreat_user FOREIGN KEY(retreat_id) REFERENCES customer(id)
);
 */

public class CustomerCheckout {
    int id;
    Date retreatTime;   //退房时间
    String retreatReason;   //退房原因
    Date askTime;   //申请时间
    String auditPerson ;    //监管人
    String auditOpinion;    //监管人意见
    int retreatId;     //退房客户id（外键）
}
