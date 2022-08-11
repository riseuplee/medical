package com.medical.service.impl;

import com.medical.entity.Drug;
import com.medical.mapper.DrugMapper;
import com.medical.service.DrugService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 药品 服务实现类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@Service
public class DrugServiceImpl extends ServiceImpl<DrugMapper, Drug> implements DrugService {

}
