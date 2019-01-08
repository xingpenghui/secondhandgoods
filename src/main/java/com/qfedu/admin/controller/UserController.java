package com.qfedu.admin.controller;


import com.qfedu.admin.entity.ResponseVo;
import com.qfedu.admin.entity.User;
import com.qfedu.admin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author java1806
 * @since 2019-01-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/findByUser.do")
    public ResponseVo<User> login(String username, String password){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        return userService.findUser(u);
    }

}
