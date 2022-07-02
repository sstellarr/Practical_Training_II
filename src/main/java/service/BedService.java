package service;

import pojo.Bed;

import java.util.List;

public interface BedService {

    /**
     * 查询所有
     * @return
     */
    List<Bed> selectAll();

    /**
     * 添加床位
     * @param bed
     */
    void add(Bed bed);



}
