package com.ma.supermarket.mapper;

import com.ma.supermarket.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    /**
     * 查询用户名是否存在，若存在，不允许注册
     * @param uname
     * @return
     */
    int  findUserByName(@Param("uname") String uname);
    /**
     * 注册
     * @param
     * @return
     */
    User regist(User user);
    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    List<User> login(@Param("account") String account ,@Param("password") String password,@Param("urole")int urole);
    /**
     * 根据用户选择的身份给他展示不同的界面
     * @param role
     * @return
     */
    int selectRole(@Param("role") String role);







}