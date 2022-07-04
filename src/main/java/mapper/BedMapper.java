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

    /**
     * 查询所有
     * @return
     */
    @Select("select * from bedmanage")
    @ResultMap("BedResultMap")
    List<Bed> selectAll();

    List<Bed> selectById(Integer id);
    /**
     * 添加床位
     * @param bed
     */
    void add(Bed bed);


    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 改
     * @param bed
     */
    void update(Bed bed);







}
