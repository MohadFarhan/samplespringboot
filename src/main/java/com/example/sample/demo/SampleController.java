package com.example.sample.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @RequestMapping("status")
    public String returnStatus()
    {
        return "I am alive";
    }
}
