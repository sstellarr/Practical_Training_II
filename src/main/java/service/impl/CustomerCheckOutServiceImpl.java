package service.impl;

import mapper.CustomerCheckInMapper;
import mapper.CustomerCheckOutMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.CustomerCheckIn;
import pojo.CustomerCheckOut;
import service.CustomerCheckOutService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CustomerCheckOutServiceImpl implements CustomerCheckOutService {

    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<CustomerCheckOut> selectAll() {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckOutMapper mapper = sqlSession.getMapper(CustomerCheckOutMapper.class);
        List<CustomerCheckOut> customerCheckOuts = mapper.selectAll();
        sqlSession.close();
        return customerCheckOuts;
    }

    @Override
    public void add(CustomerCheckOut customerCheckOut) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckOutMapper mapper = sqlSession.getMapper(CustomerCheckOutMapper.class);
        //调用方法
        mapper.add(customerCheckOut);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckOutMapper mapper = sqlSession.getMapper(CustomerCheckOutMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void update(CustomerCheckOut customerCheckOut) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckOutMapper mapper = sqlSession.getMapper(CustomerCheckOutMapper.class);
        //调用方法
        mapper.update(customerCheckOut);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public List<CustomerCheckOut> selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckOutMapper mapper = sqlSession.getMapper(CustomerCheckOutMapper.class);
        List<CustomerCheckOut> customerCheckOuts = mapper.selectById(id);
        sqlSession.close();
        return customerCheckOuts;
    }
}
