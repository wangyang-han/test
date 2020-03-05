package com.team.test.controller;



import com.team.test.entity.Type;
import com.team.test.service.byteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.controller
 * @CreateTime: 2020年02月18日10:42
 * @Description: ${Description}
 */
//@CrossOrigin
//贴在这里,那么这个控制器里所有的请求都支持跨域
@RestController
public class typeController {
    @Autowired
    private byteService byteService1;
    @CrossOrigin  //贴在这个说明就这个请求可以跨域
    @RequestMapping(value = "getAll2")
    public List<Type> getAll( Integer id,String name){
        List<Type> list = byteService1.getAll();
        return list;
    }
}
