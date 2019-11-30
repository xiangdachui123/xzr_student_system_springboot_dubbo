package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClsMapper;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */

@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private ClsMapper clsMapper;


    @Override
    public List<Classes> list() {
        List<Classes> classes = clsMapper.selectList(null);
        return classes;
    }
}
