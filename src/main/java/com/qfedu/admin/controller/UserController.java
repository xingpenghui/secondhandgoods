package com.qfedu.admin.controller;


import com.qfedu.admin.entity.ResponseVo;
import com.qfedu.admin.entity.User;
import com.qfedu.admin.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class UserController {

    @Autowired
    private IUserService userService;
    // notes：标记信息，tags：标签，value：值
    @ApiOperation(notes = "参数传递接口",tags = {"登陆"},value = "登陆")
    @PostMapping("/login.do")
    public ResponseVo<User> login(@ApiParam(value = "用户名")String username, @ApiParam(value = "密码")String password){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        return userService.findUser(u);
    }
}
