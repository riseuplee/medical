package com.medical.service.impl;

import com.medical.entity.Concern;
import com.medical.mapper.ConcernMapper;
import com.medical.service.IConcernService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注 服务实现类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@Service
public class ConcernServiceImpl extends ServiceImpl<ConcernMapper, Concern> implements IConcernService {

}
