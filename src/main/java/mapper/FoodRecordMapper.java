package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import pojo.FoodRecord;

import java.util.List;

/**
 * 膳食记录：
 * 增删查改
 * TODO：根据老人的膳食记录信息显示膳食日历
 */

public interface FoodRecordMapper {

    @Select("select * from foodrecord")
    @ResultMap("FoodRecordResultMap")
    List<FoodRecord> selectAll();

    void add(FoodRecord foodRecord );
    void deleteById(Integer id);

    void update(FoodRecord foodRecord);
}
