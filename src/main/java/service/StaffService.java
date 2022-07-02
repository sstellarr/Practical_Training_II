package service;

import pojo.NursingRecord;
import pojo.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> selectAll();


    void add(Staff staff);

}
