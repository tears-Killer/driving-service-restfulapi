package com.wj.driving.restfulapi.service.impl.homepage;

import com.alibaba.dubbo.config.annotation.Service;
import com.wj.driving.restfulapi.domain.bl.homepage.HomePageBL;
import com.wj.driving.restfulapi.dto.homepage.HomePageDTO;
import com.wj.driving.restfulapi.service.homepage.IHomePageService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class HomePageServiceImpl implements IHomePageService {

    @Autowired
    private HomePageBL homePageBL;

    @Override
    public HomePageDTO getHomePageData() {
        return homePageBL.getHomePageData();
    }
}
