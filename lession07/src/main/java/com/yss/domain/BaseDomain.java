package com.yss.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:34 2018/3/25
 */
@Getter
@Setter
public abstract class BaseDomain implements Serializable {
    private static final long serialVersionUID = -4925167018565622899L;
    protected Long id;
}
