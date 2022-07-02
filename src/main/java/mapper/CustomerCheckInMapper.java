package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.Bed;
import pojo.Customer;
import pojo.CustomerCheckIn;

import java.sql.Date;
import java.util.List;

/**
 *  入住列表：
 *  增删查改（增 可以选择床位等信息）
 */
public interface CustomerCheckInMapper {


    @Select("select * from checkinrecord")
    @ResultMap("CustomerCheckInResultMap")
    List<CustomerCheckIn> selectAll();

    @Insert("insert into checkinrecord values(null,#{bedId},#{checkInDate},,#{expirationDate},,#{attention},,null)")
    void add(CustomerCheckIn customerCheckIn );


}
