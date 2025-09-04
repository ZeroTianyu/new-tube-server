package com.newtube.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guoty
 * @since 2025/9/3 23:02
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("demo")
    public String test() {
        return "test";
    }
}
