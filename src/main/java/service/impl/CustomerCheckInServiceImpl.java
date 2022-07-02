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

    }
}
