package com.medical.service.impl;

import com.medical.entity.Registered;
import com.medical.mapper.RegisteredMapper;
import com.medical.service.IRegisteredService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 预约挂号 服务实现类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@Service
public class RegisteredServiceImpl extends ServiceImpl<RegisteredMapper, Registered> implements IRegisteredService {

}
