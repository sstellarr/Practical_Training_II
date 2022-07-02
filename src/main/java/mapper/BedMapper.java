package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.Bed;

import java.util.List;

/**
 * 床位：
 * 增删查改
 */

public interface BedMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from bedmanage")
    @ResultMap("BedResultMap")
    List<Bed> selectAll();

    /**
     * 添加床位
     * @param bed
     */
    @Insert("insert into bedmanage values(null,#{roomId},#{buildingId,#{isAvailable},null)")
    void add(Bed bed);



}
