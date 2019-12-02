package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.entity.Teacher;
import com.qf.service.IClsService;
import com.qf.service.IStuService;
import com.qf.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Service
public class StuServiceImpl implements IStuService {


    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClsService clsService;

    @Reference
    private ITeacherService iTeacherService;

    @Override
    public List<Student> list() {
        List<Student> studentList = stuMapper.selectList(null);
        return studentList;
    }

    @Override
    public List<Student> allInfoList() {
        List<Student> studentList = stuMapper.selectList(null);
        for (Student student : studentList) {
            Integer cid = student.getCid();
            Classes cls = clsService.getClsInfo(cid);
            student.setCls(cls);//装入学生信息
            Integer tid = cls.getTid();
            Teacher teacher = iTeacherService.getTeacherInfo(tid);
            student.setTeacher(teacher);//装入老师信息
        }
        return studentList;
    }
}
