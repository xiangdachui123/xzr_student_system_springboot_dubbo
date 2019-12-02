package com.qf.service;

import com.qf.entity.Teacher;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
public interface ITeacherService {
    List<Teacher> list();

    Teacher getTeacherInfo(Integer tid);
}
