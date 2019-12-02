package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
public interface IStuService {

    List<Student> list();

    List<Student> allInfoList();
}
