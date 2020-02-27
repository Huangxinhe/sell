package com.imooc.service;

import com.imooc.dataobject.dao.SellerInfo;

/**
 * @param
 * @author: Huangxinhe
 * @description //卖家端
 * @date
 **/
public interface SellerService {

    /*
     * @param
     * @author: Huangxinhe
     * @description //通过openid查询卖家端信息
     * @date
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
