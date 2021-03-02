package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author JSQ
 * @ClassName IndexController.java
 * @Description TODO
 * @createTime 2020年12月29日 13:16:00
 */
//在templates目录下的所有页面，只能通过controller来跳转
//需要模板引擎的支持！thymeleof
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("test")
    public String test(Model model) {
        model.addAttribute("msg", "<h1>hello springboot</h1>");
        model.addAttribute("users", Arrays.asList("kuang","qingjiang"));
        return "test";
    }
}
