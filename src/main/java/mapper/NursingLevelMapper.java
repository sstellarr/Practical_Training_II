package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.NursingLevel;

import java.util.List;

/**
 * 护理级别：
 * 增删查改
 */

public interface NursingLevelMapper {

    @Select("select * from nursinglevel")
    List<NursingLevel> selectAll();
}
