package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.Customer;
import pojo.CustomerCheckIn;

import java.util.List;

/**
 * 客户：
 * - 登录->查询用户名和密码（双条件查询）
 * -
 * -
 */
public interface CustomerMapper {

    @Select("select  * from customer")
    @ResultMap("CustomerResultMap")
    List<Customer> selectAll();

    void add(Customer customer );
    void deleteById(Integer id);

    void update(Customer customer);
}
