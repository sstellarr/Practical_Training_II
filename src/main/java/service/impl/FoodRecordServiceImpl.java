package service.impl;

import mapper.CustomerMapper;
import mapper.FoodRecordMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Customer;
import pojo.FoodRecord;
import service.FoodRecordService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class FoodRecordServiceImpl implements FoodRecordService {

    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<FoodRecord> selectAll() {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        List<FoodRecord> foodRecords = mapper.selectAll();
        sqlSession.close();
        return foodRecords;
    }

    @Override
    public void add(FoodRecord foodRecord) {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        //调用方法
        mapper.add(foodRecord);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void update(FoodRecord foodRecord) {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        //调用方法
        mapper.update(foodRecord);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void selectByFoodId(Integer foodId) {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        //调用方法
        mapper.selectByFoodId(foodId);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public List<FoodRecord> selectById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        FoodRecordMapper mapper = sqlSession.getMapper(FoodRecordMapper.class);
        List<FoodRecord> foodRecords = mapper.selectById(id);
        sqlSession.close();
        return foodRecords;
    }


}
