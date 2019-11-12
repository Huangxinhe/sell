package com.imooc.VO;

import lombok.Data;

/**
 * @program sell
 * @description: Http请求返回最外层对象
 * @author: huangxinhe
 * @create: 2019/09/21 11:34
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;

}
