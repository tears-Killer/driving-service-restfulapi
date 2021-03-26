package com.wj.driving.restfulapi.domain.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wj.driving.restfulapi.domain.bo.UserBO;
import com.wj.driving.restfulapi.request.user.UserSearchRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<UserBO> {

    List<UserBO> selectPage(UserSearchRequest request);

    int countUser(UserSearchRequest request);

}
