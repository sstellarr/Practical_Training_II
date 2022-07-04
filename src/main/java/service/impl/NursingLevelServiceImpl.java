package service.impl;

import mapper.FoodRecordMapper;
import mapper.NursingLevelMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.FoodRecord;
import pojo.NursingLevel;
import service.NursingLevelService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class NursingLevelServiceImpl implements NursingLevelService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<NursingLevel> selectAll() {
        SqlSession sqlSession=factory.openSession();
        NursingLevelMapper mapper = sqlSession.getMapper(NursingLevelMapper.class);
        List<NursingLevel> nursingLevels = mapper.selectAll();
        sqlSession.close();
        return nursingLevels;
    }

    @Override
    public void add(NursingLevel nursingLevel) {
        SqlSession sqlSession=factory.openSession();
        NursingLevelMapper mapper = sqlSession.getMapper(NursingLevelMapper.class);
        //调用方法
        mapper.add(nursingLevel);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        NursingLevelMapper mapper = sqlSession.getMapper(NursingLevelMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void update(NursingLevel nursingLevel) {
        SqlSession sqlSession=factory.openSession();
        NursingLevelMapper mapper = sqlSession.getMapper(NursingLevelMapper.class);
        //调用方法
        mapper.update(nursingLevel);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }
}
