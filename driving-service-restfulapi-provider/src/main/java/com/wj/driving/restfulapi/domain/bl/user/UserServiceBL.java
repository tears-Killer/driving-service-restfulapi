package com.wj.driving.restfulapi.domain.bl.user;

import com.wj.driving.restfulapi.domain.bo.UserBO;
import com.wj.driving.restfulapi.domain.mapper.user.UserMapper;
import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.enums.user.UserStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceBL {

    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> getUserList(){
        List<UserBO> userBOList = userMapper.selectList(null);
        List<UserDTO> resultList = new ArrayList<>();
        userBOList.forEach(item ->{
            UserDTO userDTO = new UserDTO();
            userDTO.setId(item.getId());
            userDTO.setName(item.getName());
            userDTO.setSex(item.getSex());
            userDTO.setNickname(item.getNickname());
            userDTO.setMobileNo(item.getMobileNo());
            userDTO.setIdCard(String.valueOf(item.getIdCard()));
            userDTO.setState(UserStatusEnum.getSourceType(item.getState()));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createTime = formatter.format(item.getCreateTime());
            userDTO.setCreateTime(createTime);
            String lastUpdateTime = formatter.format(item.getLastUpdateTime());
            userDTO.setCreateTime(lastUpdateTime);

            resultList.add(userDTO);
        });
        return resultList;
    }

}
