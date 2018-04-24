package abtion.scaffold.mapper;

import abtion.scaffold.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author abtion
 * @since 2018/4/19 16:35
 * email abtion@outlook.com
 */
@Mapper
public interface UserMapper {
//    Collection<User> getAllUser();
    User getUserById(int id);
//    User getUserByName(String name);
//    void createUser(User user);
}
