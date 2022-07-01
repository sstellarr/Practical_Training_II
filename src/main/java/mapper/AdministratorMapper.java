package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.Administrator;

import java.util.List;

/**
 * 管理员：
 * - 登录
 */

public interface AdministratorMapper {
    /**
     * 根据用户名和密码查询用户对象
     * @param username
     * @param password
     * @return
     */
    @Select("select *  from manager where account=#{username} and password=#{password}")
    List<Administrator> select(@Param("username") String username, @Param("password") String password);
}
