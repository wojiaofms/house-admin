package org.example.house.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.example.toolEntity.RetData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sjg
 * @version 1.0。0
 * @date 2024/1/10 11:28
 */
@Controller("testController")
@RequestMapping({"/house/test"})
@Slf4j
public class testController {

    @ApiOperation(value = "测试")
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/print")
    @ResponseBody
    public RetData print(String title) {
        System.out.println("打印数据——————————————————");
        title+="123456";
        return RetData.succuess(title);
    }

    @ApiOperation(value = "获取菜单名")
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getMenuList")
    @ResponseBody
    public RetData getMenuList(String title) {
        System.out.println("打印数据——————————————————");
        title+="123456";
        List<String> menus=new ArrayList<>();
        menus.add("欢迎");
        menus.add("管理员");
        menus.add("查询表格");
        System.out.println(menus.stream().toArray());
        return RetData.succuess(menus);
    }

}
