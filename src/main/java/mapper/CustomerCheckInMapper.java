package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.Customer;

import java.util.List;

/**
 *  入住列表：
 *  增删查改（增 可以选择床位等信息）
 */
public interface CustomerCheckInMapper {


    @Select("select * from checkinrecord")
    List<Customer> selectAll();
}
