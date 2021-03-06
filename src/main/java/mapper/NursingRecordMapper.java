package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.NursingRecord;
import java.util.List;

/**
 * 护理记录：
 * 增删查改
 */

public interface NursingRecordMapper {

    @Select("select * from nursingrecord")
    @ResultMap("NursingRecordResultMap")
    List<NursingRecord> selectAll();

    NursingRecord selectById(Integer id);

    void add(NursingRecord nursingRecord );
    void deleteById(Integer id);

    void update(NursingRecord nursingRecord);

}
