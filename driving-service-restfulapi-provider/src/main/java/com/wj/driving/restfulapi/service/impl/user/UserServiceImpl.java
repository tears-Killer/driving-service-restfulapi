package com.wj.driving.restfulapi.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.user.UserServiceBL;
import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.request.user.UserSearchRequest;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserServiceBL userServiceBL;

    @Override
    public PageResult<UserDTO> getUserList(UserSearchRequest request) {
        return userServiceBL.getUserList(request);
    }

    @Override
    public int insertUser(UserDTO userDTO) {
        return 0;
    }

    @Override
    public int updateUser(UserDTO userDTO) {
        return 0;
    }

    @Override
    public int deleteUser(UserDTO userDTO) {
        return 0;
    }
}
