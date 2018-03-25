package com.yss.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 16:37 2018/3/25
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends BaseDomain{
    private static final long serialVersionUID = -5552727492520607431L;
    private String name;
    private Float price;
}
