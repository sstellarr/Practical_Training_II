package pojo;

/**
 * 护理等级
 */

/*
create table nursinglevel(
id int primary key auto_increment ,
level int);
 */

public class NursingLevel {
    int id;
    String name;  //等级名称
    boolean status; //启用状态
}
