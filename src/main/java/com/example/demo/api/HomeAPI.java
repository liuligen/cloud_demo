package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ligen on 2017/10/18.
 */
@RestController
@RequestMapping(value = "/")
public class HomeAPI {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(){
        return "hello-world!";
    }

}
