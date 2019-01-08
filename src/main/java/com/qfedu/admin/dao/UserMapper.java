package com.qfedu.admin.dao;

import com.qfedu.admin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author java1806
 * @since 2019-01-07
 */
public interface UserMapper extends BaseMapper<User> {

        User findByUser(User u);
}
