package com.yss.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 23:33 2018/3/24
 */
@Data
@Builder
@AllArgsConstructor
public class User {
    private String username;
    private String password;
}
