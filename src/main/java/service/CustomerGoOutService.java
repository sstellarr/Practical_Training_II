package service;

import pojo.CustomerCheckOut;
import pojo.CustomerGoOut;

import java.util.List;

public interface CustomerGoOutService {
    List<CustomerGoOut> selectAll();


    void add(CustomerGoOut customerGoOut);

    void deleteById(Integer id);

    void update(CustomerGoOut customerGoOut);

    List<CustomerGoOut> selectById(Integer id);

}
