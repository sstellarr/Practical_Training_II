package service.impl;

import mapper.FoodRecordMapper;
import mapper.NursingLevelMapper;
import mapper.NursingRecordMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.NursingLevel;
import pojo.NursingRecord;
import service.NursingRecordService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class NursingRecordServiceImpl implements NursingRecordService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<NursingRecord> selectAll() {
        SqlSession sqlSession=factory.openSession();
        NursingRecordMapper mapper = sqlSession.getMapper(NursingRecordMapper.class);
        List<NursingRecord> nursingLevels = mapper.selectAll();
        sqlSession.close();
        return nursingLevels;
    }

    @Override
    public void add(NursingRecord nursingRecord) {
        SqlSession sqlSession=factory.openSession();
        NursingRecordMapper mapper = sqlSession.getMapper(NursingRecordMapper.class);
        //调用方法
        mapper.add(nursingRecord);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        NursingRecordMapper mapper = sqlSession.getMapper(NursingRecordMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void update(NursingRecord nursingRecord) {
        SqlSession sqlSession=factory.openSession();
        NursingRecordMapper mapper = sqlSession.getMapper(NursingRecordMapper.class);
        //调用方法
        mapper.update(nursingRecord);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public List<NursingRecord> selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        NursingRecordMapper mapper = sqlSession.getMapper(NursingRecordMapper.class);
        List<NursingRecord> nursingLevels = mapper.selectById(id);
        sqlSession.close();
        return nursingLevels;
    }
}
