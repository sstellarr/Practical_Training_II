package service.impl;

import mapper.CustomerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Customer;
import service.CustomerService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Customer> selectAll() {
        SqlSession sqlSession=factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.selectAll();
        sqlSession.close();
        return customers;
    }

    @Override
    public void add(Customer customer) {
        SqlSession sqlSession=factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        //调用方法
        mapper.add(customer);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();


    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void update(Customer customer) {
        SqlSession sqlSession=factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        //调用方法
        mapper.update(customer);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public Customer selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper.selectById(id);
        sqlSession.close();
        return customer;
    }
}
