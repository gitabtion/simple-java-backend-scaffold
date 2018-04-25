package abtion.scaffold.service;

import abtion.scaffold.domain.User;
import abtion.scaffold.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abtion
 * @since 2018/4/19 17:01
 * email abtion@outlook.com
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userMapper.getAllUsers());
    }

    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    public boolean createUser(User user) {
        return userMapper.createUser(user)==1;
    }

}
