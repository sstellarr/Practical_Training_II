package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.NursingRecord;

import java.util.List;

/**
 * 护理记录：
 * 增删查改
 */

public interface NursingRecordMapper {

    @Select("select * from nursingrecord")
    List<NursingRecord> selectAll();

}
