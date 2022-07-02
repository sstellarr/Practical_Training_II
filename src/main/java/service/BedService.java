package service;

import pojo.Bed;

import java.util.List;

public interface BedService {

    List<Bed> selectAll();

    /**
     * 添加床位
     * @param bed
     */
    void add(Bed bed);

}
