package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.Location;
import com.boot.service.LocationService;
import org.springframework.stereotype.Component;

@Component
@Service
public class LocationServiceImpl implements LocationService {
    @Override
    public Location findLocations() {
        Location location = new Location();
        location.setProvince("湖南");
        location.setCity("长沙");
        location.setCountry("芙蓉");
        return location;
    }
}
