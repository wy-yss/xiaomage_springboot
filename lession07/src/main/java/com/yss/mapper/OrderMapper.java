package com.yss.mapper;

import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:22 2018/3/25
 */
public interface OrderMapper {
    @Insert(
            "<script>" +
                    "INSERT INTO t_order (user_id,car_id) VALUES" +
                    "<foreach collection = 'arg1' item = 'carId' index = 'index' separator = ','>" +
                    "(#{arg0},#{carId})" +
                    "</foreach>" +
            "</script>"
    )
    void inserts(Integer userId, List<Integer> carIds);

    @Insert("INSERT INTO t_order (user_id,car_id) VALUES (#{arg0},#{arg1})")
    void insert(Integer userId, Integer carId);

}
