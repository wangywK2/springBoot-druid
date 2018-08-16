package com.wyw.druid.druid.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Method WebStatFilter用于采集web-jdbc关联监控的数据。
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * @PACKAGE_NAME com.wyw.druid.druid.filter
 * @Auther player
 * @Date 2018/8/16
 * @Version 1.0
 */
@WebFilter(
        urlPatterns = "/druid2/*",
        initParams = {
                @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*")
        }
)
public class DruidFilter2 extends WebStatFilter {

}
