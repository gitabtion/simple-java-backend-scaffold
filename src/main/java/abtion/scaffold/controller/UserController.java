package abtion.scaffold.controller;

import abtion.scaffold.common.Response;
import abtion.scaffold.domain.User;
import abtion.scaffold.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    //example of GetMethod
    @GetMapping("/{userId}/info")
    public Response getUserInfo(@PathVariable int userId) {
        return new Response(0,userService.getUserById(userId));
    }

    @GetMapping("/all")
    public Response getAllUsers(){
        return new Response(0,userService.getAllUsers());
    }

    @GetMapping("/name/{userName}")
    public Response getUserByName(@PathVariable String userName){
        return new Response(0,userService.getUserByName(userName));
    }

    //example of Post Method
    @PostMapping("/create")
    public Response createUser(@RequestBody @Valid User user){
        return new Response(0,userService.createUser(user));
    }

    //example of Query method
    @RequestMapping("/query")
    public Response queryUserInfo(@RequestParam(defaultValue = "1")int id){
        return new Response(0,userService.getUserById(id));
    }

}
