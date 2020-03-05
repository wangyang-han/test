package com.team.test.controller;

import com.github.pagehelper.PageInfo;

import com.team.test.entity.Bills;
import com.team.test.service.billsService;
import com.team.test.util.PageUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.controller
 * @CreateTime: 2020年02月18日10:40
 * @Description: ${Description}
 */
@Controller
public class billsController {
    @Autowired(required = false)
    private billsService billsService1;
    @RequestMapping(value = "getAll")
    public String getAll(PageUtil pageUtil, Model model){
        PageInfo<Bills> info = billsService1.getAll(pageUtil);
        model.addAttribute("pageUtil",pageUtil);
        model.addAttribute("info",info);
        return "show";
    }
    @RequestMapping(value = "update")
    public String update(Bills bills){

        int i = billsService1.update(bills);
        System.out.println(i);
        if(i>0){
            return "redirect:getAll";
        }
        return null;
    }
    @RequestMapping(value = "getOne")
    public String getOne(Integer id, Model model){
        Bills one = billsService1.getOne(id);
        model.addAttribute("one",one);
        return "update";
    }

}
