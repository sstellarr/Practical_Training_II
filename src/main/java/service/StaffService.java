package service;

import org.apache.ibatis.annotations.Param;
import pojo.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> selectAll();

    List<Staff> select( String username,  String password);

    void add(Staff staff);

    void deleteById(Integer id);

    void update(Staff staff);


}
