package com.wj.driving.restfulapi.domain.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wj.driving.restfulapi.domain.bo.UserBO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserBO> {
}
