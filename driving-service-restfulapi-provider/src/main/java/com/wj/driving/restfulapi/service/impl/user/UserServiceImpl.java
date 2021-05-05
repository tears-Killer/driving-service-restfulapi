package com.wj.driving.restfulapi.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.user.UserServiceBL;
import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.request.user.UserRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserServiceBL userServiceBL;

    @Override
    public PageResult<UserDTO> getUserList(UserRequestSearch request) {
        return userServiceBL.getUserList(request);
    }

    @Override
    public int updateUser(UserDTO userDTO) {
        return userServiceBL.updateUser(userDTO);
    }

    @Override
    public int updateUserState(UserDTO userDTO) {
        return userServiceBL.updateUserState(userDTO);
    }
}
