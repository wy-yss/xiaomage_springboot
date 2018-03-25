package com.yss.mapper;

import com.yss.domain.Car;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:22 2018/3/25
 */
public interface CarMapper {
    /**
     * 单个插入
     * @param car 要插入的车辆
     */
    @Insert("INSERT INTO t_car (name,price) VALUES (#{name},#{price})")
    void insert(Car car);

    void inserts(List<Car> cars);
}
