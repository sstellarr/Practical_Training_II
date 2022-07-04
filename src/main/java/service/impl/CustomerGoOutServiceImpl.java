package service.impl;

import mapper.CustomerCheckOutMapper;
import mapper.CustomerGoOutMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.CustomerCheckOut;
import pojo.CustomerGoOut;
import service.CustomerGoOutService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CustomerGoOutServiceImpl implements CustomerGoOutService {

    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<CustomerGoOut> selectAll() {
        SqlSession sqlSession=factory.openSession();
        CustomerGoOutMapper mapper = sqlSession.getMapper(CustomerGoOutMapper.class);
        List<CustomerGoOut> customerGoOuts = mapper.selectAll();
        sqlSession.close();
        return customerGoOuts;
    }

    @Override
    public void add(CustomerGoOut customerGoOut) {
        SqlSession sqlSession=factory.openSession();
        CustomerGoOutMapper mapper = sqlSession.getMapper(CustomerGoOutMapper.class);
        //调用方法
        mapper.add(customerGoOut);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerGoOutMapper mapper = sqlSession.getMapper(CustomerGoOutMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void update(CustomerGoOut customerGoOut) {
        SqlSession sqlSession=factory.openSession();
        CustomerGoOutMapper mapper = sqlSession.getMapper(CustomerGoOutMapper.class);
        //调用方法
        mapper.update(customerGoOut);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();


    }

    @Override
    public List<CustomerGoOut> selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerGoOutMapper mapper = sqlSession.getMapper(CustomerGoOutMapper.class);
        List<CustomerGoOut> customerGoOuts = mapper.selectById(id);
        sqlSession.close();
        return customerGoOuts;
    }
}
