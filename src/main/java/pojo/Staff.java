package pojo;

/**
 * 员工
 */

/*
create table staff(
id int primary key auto_increment,
client_name varchar(15),
client_gender char(1),
client_id varchar(15),
client_type char(2),
client_account int,
client_password int,
client_tel varchar(11)
);
 */

public class  Staff{
    int id;
    String name; //员工名称
    boolean gender;  //性别
    String ID;   //员工ID
    String type;    //种类
    String account; //用户名
    String password;    //密码
    String tel;  //电话号码
}
