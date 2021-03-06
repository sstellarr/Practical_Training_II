package service.impl;

import mapper.BedMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Bed;
import service.BedService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class BedServiceImpl implements BedService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Bed> selectAll() {
        SqlSession sqlSession=factory.openSession();
        BedMapper mapper = sqlSession.getMapper(BedMapper.class);
        List<Bed> beds = mapper.selectAll();
        sqlSession.close();
        return beds;

    }

    @Override
    public void add(Bed bed) {
        SqlSession sqlSession=factory.openSession();
        BedMapper mapper = sqlSession.getMapper(BedMapper.class);
        //调用方法
        mapper.add(bed);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        BedMapper mapper = sqlSession.getMapper(BedMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void update(Bed bed) {
        SqlSession sqlSession=factory.openSession();
        BedMapper mapper = sqlSession.getMapper(BedMapper.class);
        //调用方法
        mapper.update(bed);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public Bed selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        BedMapper mapper = sqlSession.getMapper(BedMapper.class);
        Bed bed = mapper.selectById(id);
        sqlSession.close();
        return bed;
    }
}
