package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.TeacherMapper;
import com.qf.entity.Teacher;
import com.qf.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> list() {
        List<Teacher> teacherList = teacherMapper.selectList(null);
        return teacherList;
    }

    @Override
    public Teacher getTeacherInfo(Integer tid) {
        return teacherMapper.selectById(tid);
    }
}
