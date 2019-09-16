package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program sell
 * @description: 商品service
 * @author: huangxinhe
 * @create: 2019/09/07 23:24
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    List<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存


    //减库存

}
