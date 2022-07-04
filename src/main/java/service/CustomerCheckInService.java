package service;

import pojo.Bed;
import pojo.CustomerCheckIn;

import java.util.List;

public interface CustomerCheckInService {
    /**
     * 查询所有
     * @return
     */
    List<CustomerCheckIn> selectAll();

    /**
     *
     * @param customerCheckIn
     */
    void add(CustomerCheckIn customerCheckIn);

    void deleteById(Integer id);

    void update(CustomerCheckIn customerCheckIn);

    List<CustomerCheckIn> selectById(Integer id);

}
