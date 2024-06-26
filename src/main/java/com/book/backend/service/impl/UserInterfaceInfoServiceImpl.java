package com.book.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.backend.pojo.UserInterfaceInfo;
import com.book.backend.service.UserInterfaceInfoService;
import com.book.backend.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @description 针对表【t_user_interface_info】的数据库操作Service实现
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




