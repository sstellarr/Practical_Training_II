package pojo;

import java.sql.Date;

/**
 * 客户
 */

/*
create TABLE customer(
id int primary key auto_increment,
name varchar(15),
gender char(1),
age int,
tel int,
idcardnumber int,
filenumber int,
account int,
password int,
height int,
birthday date
);
 */



public class Customer {
    int id;
    String name;    //姓名
    boolean  gender;    //性别
    int age;    //年龄
    String tel;    //电话
    String idCardNumber;   //身份卡号
    String fileNumber;     //档案编号
    String account;    //用户名
    String password;   //密码
    int height; //身高
    Date birthday;  //生日

}
