package com.ziroom.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-09-23 08:59
 * </pre>
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
