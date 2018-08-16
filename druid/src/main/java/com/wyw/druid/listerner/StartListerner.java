package com.wyw.druid.listerner;

import com.wyw.druid.entity.User;
import com.wyw.druid.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Method
 * @PACKAGE_NAME com.wyw.druid.listerner
 * @Auther player
 * @Date 2018/8/15
 * @Version 1.0
 */
@WebListener
public class StartListerner implements ServletContextListener {
    public Logger logger = LoggerFactory.getLogger(StartListerner.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext app = servletContextEvent.getServletContext();
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(app);
        UserService service = (UserService)ac.getBean("userService");
        User user = service.selectUserByUserName("test");
        logger.info(" 缓存数据： {}",user.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info(" 程序关闭 ！ ");
    }
}
