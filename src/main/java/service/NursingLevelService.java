package service;

import pojo.FoodRecord;
import pojo.NursingLevel;

import java.util.List;

public interface NursingLevelService {
    List<NursingLevel> selectAll();


    void add(NursingLevel nursingLevel);

    void deleteById(Integer id);

    void update(NursingLevel nursingLevel);

    List<NursingLevel> selectById(Integer id);

}
