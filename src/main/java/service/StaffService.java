package service;

import pojo.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> selectAll();


    void add(Staff staff);

    void deleteById(Integer id);

    void update(Staff staff);


}
