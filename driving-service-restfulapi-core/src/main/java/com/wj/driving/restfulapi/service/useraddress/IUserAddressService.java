package com.wj.driving.restfulapi.service.useraddress;

import com.wj.driving.restfulapi.dto.useraddress.UserAddressDTO;
import com.wj.driving.restfulapi.request.useraddress.UserAddressRequestSearch;
import com.wj.driving.restfulapi.result.PageResult;

import java.util.List;

/**
 * @InterfaceName IUserAddressService
 * @Description 目的地管理
 * @Author wangjian
 * @Date 2021/4/1 10:56
 */
public interface IUserAddressService {

    /**
     * 查询客户默认目的地列表分页
     * @return
     */
    PageResult<UserAddressDTO> selectPage(UserAddressRequestSearch request);

    /**
     * 根据客户Id查询客户的常用目的地
     * @param userAddressDTO
     * @return
     */
    List<UserAddressDTO> getcommonlyAddressList(UserAddressDTO userAddressDTO);

    /**
     * 将地址设为默认地址
     * @param userAddressDTO
     */
    void setDefaultAddress(UserAddressDTO userAddressDTO);

    /**
     * 删除地址
     * @param userAddressDTO
     */
    void deleteAddress(UserAddressDTO userAddressDTO);
}