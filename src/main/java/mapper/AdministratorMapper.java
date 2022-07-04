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
     * @param username 用户名
     * @param password  密码
     * @return 查询结果
     */
    List<Administrator> select(@Param("username") String username, @Param("password") String password);
}
