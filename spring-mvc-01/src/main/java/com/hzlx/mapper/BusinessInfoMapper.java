package com.hzlx.mapper;

import com.hzlx.entity.BusinessInfo;
import org.apache.ibatis.annotations.Param;

public interface BusinessInfoMapper {
    BusinessInfo selectByUserNameAndPassword(@Param("userName") String userName,@Param("password") String password);
}
