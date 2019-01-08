package com.qfedu.admin.service;

import com.qfedu.admin.entity.ResponseVo;
import com.qfedu.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.admin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-07
 */
public interface IUserService  {

    ResponseVo<User> findUser(User u);


}
