package com.qfedu.admin.service.impl;

import com.qfedu.admin.entity.ResponseVo;
import com.qfedu.admin.entity.User;
import com.qfedu.admin.mapper.UserMapper;
import com.qfedu.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author java1806
 * @since 2019-01-07
 */
@Service
public  class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userDao;

    public ResponseVo<User> findUser(User u) {

        User user = userDao.findByUser(u);

        if (user != null){

            return ResponseVo.OK(null);
        }

        return null;

    }
}


