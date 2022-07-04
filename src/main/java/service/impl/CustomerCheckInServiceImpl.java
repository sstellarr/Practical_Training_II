package service.impl;

import mapper.BedMapper;
import mapper.CustomerCheckInMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Bed;
import pojo.CustomerCheckIn;
import service.CustomerCheckInService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CustomerCheckInServiceImpl implements CustomerCheckInService {

    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<CustomerCheckIn> selectAll() {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckInMapper mapper = sqlSession.getMapper(CustomerCheckInMapper.class);
        List<CustomerCheckIn> customerCheckIns = mapper.selectAll();
        sqlSession.close();
        return customerCheckIns;
    }

    @Override
    public void add(CustomerCheckIn customerCheckIn) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckInMapper mapper = sqlSession.getMapper(CustomerCheckInMapper.class);
        //调用方法
        mapper.add(customerCheckIn);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckInMapper mapper = sqlSession.getMapper(CustomerCheckInMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void update(CustomerCheckIn customerCheckIn) {
        SqlSession sqlSession=factory.openSession();
        CustomerCheckInMapper mapper = sqlSession.getMapper(CustomerCheckInMapper.class);
        //调用方法
        mapper.update(customerCheckIn);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }
}
