package service;

import pojo.NursingLevel;
import pojo.NursingRecord;

import java.util.List;

public interface NursingRecordService {
    List<NursingRecord> selectAll();


    void add(NursingRecord nursingRecord);

    void deleteById(Integer id);

    void update(NursingRecord nursingRecord);

}
