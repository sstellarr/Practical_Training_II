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
    private Integer id;
    private String food;    //食物种类
    private Integer foodId;    //与客户的外键

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

    @Override
    public String toString() {
        return "FoodRecord{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", foodId=" + foodId +
                '}';
    }
}
