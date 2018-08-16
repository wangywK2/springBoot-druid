package com.wyw.druid.Controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.alibaba.fastjson.JSONObject;
import com.wyw.druid.entity.User;
import com.wyw.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Method
 * @PACKAGE_NAME com.wyw.druid.Controller
 * @Auther player
 * @Date 2018/8/15
 * @Version 1.0
 */
@RestController
public class DruidController {
    @Autowired
    private UserService userService;
    @GetMapping("/durid/stat")
    public Object druidData(){
        /**
         * DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，
         * 除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
         */
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

    @GetMapping("/durid/stat2")
    public Object druidData2(){
        /**
         * DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，
         * 除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
         */
        DruidStatManagerFacade druidStatManagerFacade = DruidStatManagerFacade.getInstance();


        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

    @GetMapping("/test1")
    public Object test1(){
        User user = userService.selectUserByUserName("test");
        JSONObject json = new JSONObject();
        json.put("success",true);
        json.put("data",user);
        return json;
    }
}
