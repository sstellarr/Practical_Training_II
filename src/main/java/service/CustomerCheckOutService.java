package service;

import pojo.CustomerCheckOut;

import java.util.List;

public interface CustomerCheckOutService {

    List<CustomerCheckOut> selectAll();


    void add(CustomerCheckOut customerCheckOut);

    void deleteById(Integer id);

    void update(CustomerCheckOut customerCheckOut);
    List<CustomerCheckOut> selectById(Integer id);
}
