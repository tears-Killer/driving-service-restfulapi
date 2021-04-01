/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.domain.mapper.useraddress;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wj.driving.restfulapi.domain.bo.AddressBO;

import java.util.List;

/**
 * @InterfaceName UserAddressMapper
 * @Description 目的地管理
 * @Author wangjian
 * @Date 2021/4/1 11:23
 */
public interface UserAddressMapper extends BaseMapper<AddressBO> {

    List<AddressBO> getDefaultAddressList(AddressBO addressBO);
}