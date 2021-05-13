package com.wj.driving.restfulapi.domain.mapper.homepage;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wj.driving.restfulapi.dto.homepage.DriverOrderDTO;
import com.wj.driving.restfulapi.dto.homepage.HomePageDTO;

import java.util.List;

public interface HomePageMapper{

    HomePageDTO getDailyOrder();

    int getDailyUsers();

    List<Integer> getWeeklyOrders();

    List<DriverOrderDTO> getMonthOrders();
}
