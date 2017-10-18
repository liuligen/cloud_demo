package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ligen on 2017/10/18.
 */
@Controller
@RequestMapping(value = "/")
public class HomeAPI {

    public String home(){
        return "hello";
    }

}
