package service;

import pojo.Bed;

import java.util.List;

public interface BedService {

    /**
     * 查询所有
     * @return 查询结果
     */
    List<Bed> selectAll();

    /**
     * 添加床位
     * @param bed 添加信息
     */
    void add(Bed bed);

    void deleteById(Integer id);

    void update(Bed bed);

    Bed selectById(Integer id);






}
