package com.stackroute.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController
{
    //method to take the name as input and display it
    @RequestMapping("/login")
    public ModelAndView display(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user")User user)
    {
        String t1 = request.getParameter("username");
        String t2 = request.getParameter("password");
        user.setUserName(t1);
    ModelAndView mv = new ModelAndView("display");
    mv.addObject("name",user.getUserName());
       return mv;
    }
}
