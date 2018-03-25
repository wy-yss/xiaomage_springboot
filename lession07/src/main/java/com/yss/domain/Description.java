package com.yss.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yss
 * @Description: 住址
 * @Date: Created in 12:34 2018/3/25
 */
@Getter
@Setter
public class Description extends BaseDomain {
    private static final long serialVersionUID = -7775139256431127881L;
    private String province;
    private String city;
}
