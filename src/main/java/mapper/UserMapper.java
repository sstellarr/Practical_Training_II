package mapper;

import pojo.User;
import java.util.List;

//this is a demo!!!
public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);

}
