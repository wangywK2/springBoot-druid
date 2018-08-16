package com.wyw.druid.druid.filter;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * 通过 servlet 实现 查看druid 默认监控页面
 *
 * @Method  StatViewServlet用于展示Druid的统计信息,提供监控信息展示的html页面,提供监控信息的JSON API
 *  有两个属性可以用来表示Servlet的访问路径，分别是value和urlPatterns。value和urlPatterns都是数组形式，
 *  表示我们可以把一个Servlet映射到多个访问路径，但是value和urlPatterns不能同时使用。
 * @PACKAGE_NAME com.wyw.druid.druid.filter
 * @Auther player
 * @Date 2018/8/16
 * @Version 1.0
 */
@WebServlet(
        urlPatterns = {"/druid/*"},
        initParams = {
                @WebInitParam(name = "loginUsername",value = "admin"),
                @WebInitParam(name = "loginPassword",value = "admin"),
                @WebInitParam(name = "resetEnable",value = "false")
                //@WebInitParam(name = "allow", value = "127.0.0.1")
        }
)
public class DruidFilter extends StatViewServlet{
}
