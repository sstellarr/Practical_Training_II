package service;

import pojo.Customer;
import pojo.CustomerGoOut;

import java.util.List;

public interface CustomerService {
    List<Customer> selectAll();


    void add(Customer customer);
}
