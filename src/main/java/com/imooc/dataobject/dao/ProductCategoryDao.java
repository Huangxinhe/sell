package com.imooc.dataobject.dao;

import com.imooc.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @program sell
 * @description:
 * @author: huangxinhe
 * @create: 2019/09/01 22:45
 */
public class ProductCategoryDao {
    @Autowired
    ProductCategoryMapper mapper;
    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }
}
