package com.wj.driving.restfulapi.domain.bl.homepage;

import com.wj.driving.restfulapi.domain.mapper.homepage.HomePageMapper;
import com.wj.driving.restfulapi.dto.homepage.DriverOrderDTO;
import com.wj.driving.restfulapi.dto.homepage.HomePageDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class HomePageBL {

    @Resource
    private HomePageMapper homePageMapper;

    public HomePageDTO getHomePageData(){
        HomePageDTO result = new HomePageDTO();
        HomePageDTO dailyOrder = homePageMapper.getDailyOrder();
        if(Objects.nonNull(dailyOrder)){
            result.setOrderNum(dailyOrder.getOrderNum());
            result.setTotalMoney(dailyOrder.getTotalMoney());
        }
        int dailyUsers = homePageMapper.getDailyUsers();
        List<Integer> weeklyOrders = homePageMapper.getWeeklyOrders();
        List<DriverOrderDTO> monthOrders = homePageMapper.getMonthOrders();
        result.setUserNum((long) dailyUsers);
        result.setWeekOrders(weeklyOrders);
        result.setDriverOrders(monthOrders);
        return result;
    }
}
