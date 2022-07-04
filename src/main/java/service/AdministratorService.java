package service;

import org.apache.ibatis.annotations.Param;
import pojo.Administrator;

import java.util.List;

public interface AdministratorService {

    List<Administrator> select( String username,String password);
}
