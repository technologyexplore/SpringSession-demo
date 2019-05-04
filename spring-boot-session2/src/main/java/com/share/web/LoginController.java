package com.share.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.share.constants.Constant;

@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String login(HttpServletRequest request,String userName) {
        HttpSession session = request.getSession();
        Object loginUserName = session.getAttribute(Constant.LOGIN_SESSION);
        if(userName==null&&loginUserName==null) {
            return "redirect:/toLogin";
        }
        if(loginUserName==null) {
            session.setAttribute(Constant.LOGIN_SESSION, userName);  
        }
        return "redirect:/index";
    }
    
    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object loginUserName = session.getAttribute(Constant.LOGIN_SESSION);
        if(loginUserName!=null) {
            return "redirect:/index"; 
        }else {
            return "login";
        }
    }
    
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object loginUserName = session.getAttribute(Constant.LOGIN_SESSION);
        if(loginUserName!=null) {
            return "index"; 
        }else {
            return "login";
        }
    }
    
}
