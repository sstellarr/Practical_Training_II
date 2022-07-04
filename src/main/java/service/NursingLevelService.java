package service;

import pojo.NursingLevel;

import java.util.List;

public interface NursingLevelService {
    List<NursingLevel> selectAll();


    void add(NursingLevel nursingLevel);

    void deleteById(Integer id);

    void update(NursingLevel nursingLevel);

    NursingLevel selectById(Integer id);

}
