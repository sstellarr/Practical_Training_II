package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.CustomerCheckIn;
import pojo.NursingLevel;

import java.util.List;

/**
 * 护理级别：
 * 增删查改
 */

public interface NursingLevelMapper {

    @Select("select * from nursinglevel")
    @ResultMap("NursingLevelResultMap")
    List<NursingLevel> selectAll();

    List<NursingLevel> selectById(Integer id);

    void add(NursingLevel nursingLevel );
    void deleteById(Integer id);

    void update(NursingLevel nursingLevel);
}
