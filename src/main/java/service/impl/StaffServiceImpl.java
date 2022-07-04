package service.impl;

import mapper.NursingRecordMapper;
import mapper.StaffMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.NursingRecord;
import pojo.Staff;
import service.StaffService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class StaffServiceImpl implements StaffService {
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Staff> selectAll() {
        SqlSession sqlSession=factory.openSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        List<Staff> staff = mapper.selectAll();
        sqlSession.close();
        return staff;
    }

    @Override
    public void add(Staff staff) {
        SqlSession sqlSession=factory.openSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        //调用方法
        mapper.add(staff);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteById(Integer id) {
        SqlSession sqlSession=factory.openSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        //调用方法
        mapper.deleteById(id);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }

    @Override
    public void update(Staff staff) {
        SqlSession sqlSession=factory.openSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        //调用方法
        mapper.update(staff);
        sqlSession.commit();//提交事务
        //释放资源
        sqlSession.close();

    }
}
