package com.imooc.dataobject.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program sell
 * @description: 卖家信息
 * @author: huangxinhe
 * @create: 2020/02/20 23:19
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

}
