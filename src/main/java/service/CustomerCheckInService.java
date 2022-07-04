package service;

import pojo.Bed;
import pojo.CustomerCheckIn;

import java.util.List;

public interface CustomerCheckInService {
    /**
     * 查询所有
     * @return 查询结果
     */
    List<CustomerCheckIn> selectAll();

    /**
     *
     * @param customerCheckIn 添加数据
     */
    void add(CustomerCheckIn customerCheckIn);

    void deleteById(Integer id);

    void update(CustomerCheckIn customerCheckIn);

    CustomerCheckIn selectById(Integer id);

}
