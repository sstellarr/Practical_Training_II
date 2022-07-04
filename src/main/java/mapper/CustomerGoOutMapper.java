package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import pojo.CustomerGoOut;

import java.util.List;

/**
 * 外出信息：
 * 增删查改
 */
public interface CustomerGoOutMapper {
    @Select("select * from outgoing")
    @ResultMap("CustomerGoOutResultMap")
    List<CustomerGoOut> selectAll();

    void add(CustomerGoOut customerGoOut );
    void deleteById(Integer id);

    void update(CustomerGoOut customerGoOut);
}
