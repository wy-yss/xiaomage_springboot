package com.yss.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yss.util.BeansUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.List;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 23:33 2018/3/24
 */
@Getter
@Setter
public class User extends BaseDomain {

    private static final long serialVersionUID = 3070689026044869532L;
    private String username;
    private String password;
    private Description description;
    private List<Car> cars;

    public String getDescription() {
        // 将对象转化为json
        String description = null;
        try {
            description = BeansUtil.objectMapper.writeValueAsString(this.description);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return description;
    }

    public void setDescription(String description) {
        // 将json转化为对象
        try {
            this.description = BeansUtil.objectMapper.readValue(description, Description.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
