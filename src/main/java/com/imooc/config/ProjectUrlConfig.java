package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program sell
 * @description:
 * @author: huangxinhe
 * @create: 2020/02/22 23:07
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {
    /**
     * 微信公众账号授权url
     */
    public String wechatMpAuthorize;
    /**
     * 微信开发平台授权url
     */
    public String wechatOpenAuthprize;

    /**
     * 点餐系统
     */
    public String sell;


}
