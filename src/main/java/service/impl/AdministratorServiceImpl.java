package service.impl;

import mapper.AdministratorMapper;
import mapper.BedMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Administrator;
import pojo.Bed;
import service.AdministratorService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class AdministratorServiceImpl implements AdministratorService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Administrator> select(String username, String password) {
        SqlSession sqlSession=factory.openSession();
        AdministratorMapper mapper = sqlSession.getMapper(AdministratorMapper.class);
        List<Administrator> administrators = mapper.select(username,password);
        sqlSession.close();
        return administrators;

    }
}
