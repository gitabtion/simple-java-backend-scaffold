package abtion.scaffold.mapper;

import abtion.scaffold.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

/**
 * @author abtion
 * @since 2018/4/19 16:35
 * email abtion@outlook.com
 */
@Mapper
public interface UserMapper {
    Collection<User> getAllUsers();
    User getUserById(int id);
    User getUserByName(String name);
    int createUser(User user);
}
