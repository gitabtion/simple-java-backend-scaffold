package abtion.scaffold.service;

import abtion.scaffold.domain.User;
import abtion.scaffold.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author abtion
 * @since 2018/4/19 17:01
 * email abtion@outlook.com
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }

}
