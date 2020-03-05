package com.team.test.service.impl;

import com.team.test.entity.Type;
import com.team.test.entity.TypeExample;
import com.team.test.mapper.TypeMapper;
import com.team.test.service.byteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.service.impl
 * @CreateTime: 2020年02月18日10:38
 * @Description: ${Description}
 */
@Service
public class byteServiceimpl implements byteService {
    @Autowired(required = false)
    private TypeMapper typeMapper;


    @Override
    public List<Type> getAll() {
        List<Type> list = typeMapper.selectByExample(new TypeExample());
        return list;
    }
}
