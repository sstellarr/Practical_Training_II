package pojo;

/**
 * 膳食记录
 */

/*
create table foodrecord(
id int primary key auto_increment,
food varchar(20),
food_id int,
CONSTRAINT fk_food_user FOREIGN KEY(food_id) REFERENCES customer(id)
);
 */
public class FoodRecord {
    int id;
    String food;    //食物种类
    int foodId;    //与客户的外键

}
