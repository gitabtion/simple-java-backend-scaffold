package abtion.demo_gradle.controller;

import abtion.demo_gradle.common.Response;
import abtion.demo_gradle.domain.User;
import abtion.demo_gradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abtion
 * @since 2018/4/17 17:42
 * email abtion@outlook.com
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/{userId}/info")
    public Response getUserInfo(@PathVariable int userId) {
        User user = userService.getUserById(userId);
        return new Response(0,user);
    }
}
