package com.yss.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 16:34 2018/3/25
 */
public interface BeansUtil {
    ObjectMapper objectMapper = (ObjectMapper) SpringBeanUtil.getBean(ObjectMapper.class);
}
