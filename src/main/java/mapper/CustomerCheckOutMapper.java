package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import pojo.CustomerCheckOut;
import pojo.CustomerGoOut;

import java.util.List;

/**
 * 退住列表：
 * 增删查改
 */

public interface CustomerCheckOutMapper {

    @Select("select * from retreatrecord")
    @ResultMap("CustomerCheckOutResultMap")
    List<CustomerCheckOut> selectAll();


    void add(CustomerCheckOut customerCheckOut );

    void deleteById(Integer id);

    void update(CustomerCheckOut customerCheckOut);


}
