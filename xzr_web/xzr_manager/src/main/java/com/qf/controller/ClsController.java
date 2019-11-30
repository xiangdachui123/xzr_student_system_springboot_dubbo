package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */

@Controller
@RequestMapping("/cls")
public class ClsController {

    @Reference
    private IClsService clsService;

    @RequestMapping("/list")
    public String clsList(Model model){

        List<Classes> classesList = clsService.list();

        model.addAttribute("clsList",classesList);

        return "clsList";
    }

}
