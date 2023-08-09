package com.hdsam.httptest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 *
 * @author Yeo
 * @date 2023/8/10
 */
@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping
    public String index(){
        return "hello World";
    }
}
