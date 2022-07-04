package service;

import pojo.Administrator;

import java.util.List;

public interface AdministratorService {

    List<Administrator> select( String username,String password);
}
