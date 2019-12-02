package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;

    @RequestMapping("/list")
    public String stuList(Model model){

        List<Student> studentList = stuService.list();
        model.addAttribute("stuList",studentList);
        return "stuList";
    }


    @RequestMapping("/allInfoList")///stu/allInfoList
    public String  allInfoList(Model model){

        List<Student> studentList = stuService.allInfoList();
        model.addAttribute("stuList",studentList);
        return "stuAllInfoList";
    }

}
