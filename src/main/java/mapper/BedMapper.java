package mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pojo.Bed;

import java.util.List;

/**
 * 床位：
 * 增删查改
 */

public interface BedMapper {

    @Select("select * from bedmanage")
    @ResultMap("BedResultMap")
    List<Bed> selectAll();

    /**
     * 通过ID查询
     *
     * @param id 编号
     * @return 查询结果
     */
    Bed selectById(Integer id);

    void add(Bed bed);

    void deleteById(Integer id);

    void update(Bed bed);


}
