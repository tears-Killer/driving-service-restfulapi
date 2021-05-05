package com.wj.driving.restfulapi.service.user;

import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.request.user.UserRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;

public interface IUserService {
    /**
     * 获取所有用户
     * @return
     */
    PageResult<UserDTO> getUserList(UserRequestSearch request);

    /**
     * 更新用户
     * @param userDTO
     * @return
     */
   int updateUser(UserDTO userDTO);

    /**
     * 修改用户状态
     * @param userDTO
     * @return
     */
   int updateUserState(UserDTO userDTO);

}
