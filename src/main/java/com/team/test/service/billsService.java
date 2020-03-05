package com.team.test.service;


import com.github.pagehelper.PageInfo;
import com.team.test.entity.Bills;
import com.team.test.util.PageUtil;


import java.util.List;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.service
 * @CreateTime: 2020年02月18日10:35
 * @Description: ${Description}
 */
public interface billsService {
    PageInfo<Bills> getAll(PageUtil pageUtil);
    //查单条
    Bills getOne(Integer id);
    //修改
    int update(Bills bills);
    List<Bills> get();
}
