package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description TODO
 * @Author yanyi
 * @Date 2019/5/20 16:53
 * @Version 1.0
 **/
@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){



        return "hello world";
    }


}