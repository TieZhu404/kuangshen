package com.kuang.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author JSQ
 * @ClassName LoginController.java
 * @Description TODO
 * @createTime 2021年01月01日 15:53:00
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession httpSession) {
        //具体业务：判断用户名和密码是否正确
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            httpSession.setAttribute("loginUser", username);
            //此处使用重定向，在MyMvcConfig.java中设置实际跳转的页面地址，地址栏中不显示用户名和密码，只显示假的页面地址（main），实际是dashboard
            //return "redirect:/main.html";
            //此处直接使用post请求，在页面form表单action中修改请求方式，就可以实现安全请求（不在地址栏中显示用户名和密码）
            return "dashboard.html";
        }else {
            //告诉用户登录失败
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
