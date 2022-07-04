package service;

import pojo.CustomerGoOut;

import java.util.List;

public interface CustomerGoOutService {
    List<CustomerGoOut> selectAll();


    void add(CustomerGoOut customerGoOut);

    void deleteById(Integer id);

    void update(CustomerGoOut customerGoOut);

    CustomerGoOut selectById(Integer id);

}
