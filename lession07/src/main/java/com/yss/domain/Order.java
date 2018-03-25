package com.yss.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 16:37 2018/3/25
 */
@Getter
@Setter
public class Order extends BaseDomain {
    private static final long serialVersionUID = 7989578070512557016L;
    private Long userId;
    private Long carId;
}
