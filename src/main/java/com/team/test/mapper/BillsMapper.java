package com.team.test.mapper;

import com.team.test.entity.Bills;
import com.team.test.entity.BillsExample;
import com.team.test.util.PageUtil;

import java.util.List;

public interface BillsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bills record);

    int insertSelective(Bills record);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);

    List<Bills> getAll(PageUtil pageUtil);
}