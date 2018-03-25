package com.yss.mapper;

import com.yss.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:22 2018/3/25
 */
public interface UserMapper {
    @Insert("INSERT INTO t_user(username, password) VALUES (#{username},#{password})")
    void insert(User user);

    @Select("SELECT description FROM t_user WHERE id = #{id}")
    String selectDescriptionById(Integer id);

    @Select("SELECT * FROM t_user WHERE id= #{id}")
    User selectById(Integer id);
}
