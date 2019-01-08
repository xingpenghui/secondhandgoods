package com.qfedu.admin.mapper;

import com.qfedu.admin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

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
