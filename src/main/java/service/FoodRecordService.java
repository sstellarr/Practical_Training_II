package service;

import pojo.FoodRecord;

import java.util.List;

public interface FoodRecordService {
    List<FoodRecord> selectAll();


    void add(FoodRecord foodRecord);

    void deleteById(Integer id);

    void update(FoodRecord foodRecord);

    void selectByFoodId(Integer foodId);

    FoodRecord selectById(Integer id);

}
