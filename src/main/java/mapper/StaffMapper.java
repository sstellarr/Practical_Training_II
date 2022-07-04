package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import pojo.Staff;

import java.util.List;

/**
 * 员工：
 * - 增删查改
 * - 设置与老人的护理关系
 */

public interface StaffMapper {

    @Select("select * from staff")
    @ResultMap("StaffResultMap")
    List<Staff> selectAll();


    /**
     * 根据用户名和密码查询用户对象
     * @param username
     * @param password
     * @return
     */
    @Select("select *  from staff where account=#{username} and password=#{password}")
    List<Staff> select(@Param("username") String username, @Param("password") String password);

    List<Staff> selectById(Integer id);
    void add(Staff staff );
    void deleteById(Integer id);

    void update(Staff staff);
}
