package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @program sell
 * @description: 枚举工具类
 * @author: huangxinhe
 * @create: 2020/01/06 23:03
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
