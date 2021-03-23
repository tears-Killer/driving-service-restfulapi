package com.wj.driving.restfulapi.service.user;

import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.request.user.UserSearchRequest;

import java.util.List;

public interface IUserService {
    /**
     * 获取所有用户
     * @return
     */
   List<UserDTO> getUserList(UserSearchRequest request);

    /**
     * 插入新用户
     * @param userDTO
     * @return
     */
   int insertUser(UserDTO userDTO);

    /**
     * 更新用户
     * @param userDTO
     * @return
     */
   int updateUser(UserDTO userDTO);

    /**
     * 删除用户
     * @param userDTO
     * @return
     */
   int deleteUser(UserDTO userDTO);
}
