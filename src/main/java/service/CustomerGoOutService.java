package service;

import pojo.CustomerCheckOut;
import pojo.CustomerGoOut;

import java.util.List;

public interface CustomerGoOutService {
    List<CustomerGoOut> selectAll();


    void add(CustomerGoOut customerGoOut);
}
