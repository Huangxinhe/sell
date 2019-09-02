package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program sell
 * @description: 类目dao
 * @author: huangxinhe
 * @create: 2019/09/01 22:25
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
