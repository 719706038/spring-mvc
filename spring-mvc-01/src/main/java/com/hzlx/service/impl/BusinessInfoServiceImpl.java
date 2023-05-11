package com.hzlx.service.impl;

import com.hzlx.entity.BusinessInfo;
import com.hzlx.mapper.BusinessInfoMapper;
import com.hzlx.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessInfoServiceImpl implements BusinessInfoService {

    @Autowired
    private BusinessInfoMapper businessInfoMapper;
    @Override
    public BusinessInfo login(String userName, String password) {
        BusinessInfo businessInfo = businessInfoMapper.selectByUserNameAndPassword(userName, password);
        return businessInfo;
    }
}
