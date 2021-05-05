package com.wj.driving.restfulapi.domain.bl.user;

import com.wj.driving.restfulapi.domain.bo.UserBO;
import com.wj.driving.restfulapi.domain.mapper.user.UserMapper;
import com.wj.driving.restfulapi.dto.user.UserDTO;
import com.wj.driving.restfulapi.enums.user.UserStatusEnum;
import com.wj.driving.restfulapi.request.user.UserRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;
import com.wj.driving.restfulapi.utils.PrivacyDimmer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceBL {

    @Resource
    private UserMapper userMapper;

    public PageResult<UserDTO> getUserList(UserRequestSearch request){
        PageResult<UserDTO> result = new PageResult<>();
        int totalCount = userMapper.countUser(request);
        List<UserBO> userBOList = userMapper.selectPage(request);
        List<UserDTO> resultList = new ArrayList<>();
        if(totalCount>0){
            userBOList.forEach(item ->{
                UserDTO userDTO = new UserDTO();
                userDTO.setId(item.getId());
                userDTO.setName(item.getName());
                userDTO.setSex(item.getSex());
                userDTO.setNickname(item.getNickname());
                userDTO.setMobileNo(item.getMobileNo());
                if(StringUtils.isNotBlank(item.getIdCard())){
                    String idCard = PrivacyDimmer.maskIdCard(item.getIdCard());
                    userDTO.setIdCard(idCard);
                }
                userDTO.setState(item.getState());
                userDTO.setStateName(UserStatusEnum.getSourceType(item.getState()));
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime = formatter.format(item.getCreateTime());
                userDTO.setCreateTime(createTime);
                String lastUpdateTime = formatter.format(item.getLastUpdateTime());
                userDTO.setLastUpdateTime(lastUpdateTime);

                resultList.add(userDTO);
            });
            result.setList(resultList);
            result.setTotalCount(totalCount);
        }
        return result;
    }

    public int updateUser(UserDTO userDTO){
        return userMapper.updateUser(userDTO);
    }

    public int updateUserState(UserDTO userDTO){
       return userMapper.updateUserState(userDTO);
    }
}
