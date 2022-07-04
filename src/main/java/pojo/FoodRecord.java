package pojo;

import java.sql.Date;

/**
 * 膳食记录
 */

/*
create table foodrecord(
id int primary key auto_increment,
food varchar(100),
food_date date,
food_id int,
CONSTRAINT fk_food_user FOREIGN KEY(food_id) REFERENCES customer(id)
);
 */
public class FoodRecord {
    private Integer id;
    private String food;    //食物种类

    private Date date;  //日期
    private Integer foodId;    //与客户的外键

    public FoodRecord() {
    }

    public FoodRecord(Integer id, String food, Date date, Integer foodId) {
        this.id = id;
        this.food = food;
        this.date = date;
        this.foodId = foodId;
    }

    public FoodRecord(String food, Date date, Integer foodId) {
        this.food = food;
        this.date = date;
        this.foodId = foodId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FoodRecord{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", date=" + date +
                ", foodId=" + foodId +
                '}';
    }
}
