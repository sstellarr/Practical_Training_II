package service;

import pojo.CustomerCheckIn;
import pojo.CustomerCheckOut;

import java.util.List;

public interface CustomerCheckOutService {

    List<CustomerCheckOut> selectAll();


    void add(CustomerCheckOut customerCheckOut);
}
