package com.team.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.test.entity.Bills;
import com.team.test.entity.BillsExample;
import com.team.test.mapper.BillsMapper;
import com.team.test.service.billsService;
import com.team.test.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.service.impl
 * @CreateTime: 2020年02月18日10:36
 * @Description: ${Description}
 */
@Service
public class billsServiceimpl implements billsService {
    @Autowired(required = false)
    private BillsMapper billsMapper;
    @Override
    public PageInfo<Bills> getAll(PageUtil pageUtil) {
            if(pageUtil.getPage()!=null&&pageUtil.getPageSize()!=null){
                PageHelper.startPage(pageUtil.getPage(),pageUtil.getPageSize());
            }
        List<Bills> all = billsMapper.getAll(pageUtil);
        return new PageInfo<>(all);
    }

    @Override
    public Bills getOne(Integer id) {
        Bills bills = billsMapper.selectByPrimaryKey(id);
        return bills;
    }

    @Override
    public int update(Bills bills) {
        int i = billsMapper.updateByPrimaryKeySelective(bills);
        return i;
    }

    @Override
    public List<Bills> get() {
        List<Bills> list = billsMapper.selectByExample(new BillsExample());
        return list;
    }
}
