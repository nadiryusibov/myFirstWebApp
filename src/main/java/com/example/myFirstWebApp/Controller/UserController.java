package com.example.myFirstWebApp.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {


    @RequestMapping("/users")
    @ResponseBody
    public String demo() {
        return "Hello java";
    }


    @RequestMapping("/users-html")
    @ResponseBody
    public String demo2() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title > My first html page </title >");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<p> Im backend java developer.< / p >");
        sb.append("</body>");
        sb.append("</html >");
        return sb.toString();
    }
}
