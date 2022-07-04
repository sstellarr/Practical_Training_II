package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import java.util.List;

/**
 *  入住列表：
 *  增删查改（增 可以选择床位等信息）
 */
public interface CustomerCheckInMapper {



    @Select("select * from checkinrecord")
    @ResultMap("CustomerCheckInResultMap")
    List<CustomerCheckIn> selectAll();

    CustomerCheckIn selectById(Integer id);

    void add(CustomerCheckIn customerCheckIn );

    void deleteById(Integer id);

    void update(CustomerCheckIn customerCheckIn);




}
