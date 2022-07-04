package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.FoodRecord;
import java.util.List;

/**
 * 膳食记录：
 * 增删查改
 */

public interface FoodRecordMapper {

    @Select("select * from foodrecord")
    @ResultMap("FoodRecordResultMap")
    List<FoodRecord> selectAll();

    FoodRecord selectById(Integer id);

    void add(FoodRecord foodRecord );
    void deleteById(Integer id);

    void update(FoodRecord foodRecord);

    /**
     * 查某个客户的所有膳食记录
     * @param foodId 要查询的用户的id
     */
    void selectByFoodId(Integer foodId);

}
