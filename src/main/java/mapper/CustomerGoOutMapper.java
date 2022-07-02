package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.CustomerGoOut;

import java.util.List;

/**
 * 外出信息：
 * 增删查改
 */
public interface CustomerGoOutMapper {
    @Select("select * from outgoing")
    List<CustomerGoOut> selectAll();
}
