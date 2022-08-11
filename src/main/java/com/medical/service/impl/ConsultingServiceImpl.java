package com.medical.service.impl;

import com.medical.entity.Consulting;
import com.medical.mapper.ConsultingMapper;
import com.medical.service.IConsultingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 咨询表 服务实现类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@Service
public class ConsultingServiceImpl extends ServiceImpl<ConsultingMapper, Consulting> implements IConsultingService {

}
