package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.FoodRecord;

import java.util.List;

/**
 * 膳食记录：
 * 增删查改
 * TODO：根据老人的膳食记录信息显示膳食日历
 */

public interface FoodRecordMapper {

    @Select("select * from foodrecord")
    List<FoodRecord> selectAll();
}
