package net.togogo.controller;

import net.togogo.bean.User;
import net.togogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author lingeros
 * @date 18-8-15
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getUser")
    public String getUser(@RequestParam("user_id") Integer user_id, HttpSession session){
        User user = userService.getUser(user_id);
        session.setAttribute("user",user);
        return "getUser.jsp";
    }

}
