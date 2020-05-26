package com.example.test2.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Mochi
 * @Description TODO
 * @Date 2020/5/21 9:02
 * @Name RedirectController
 */
@RestController
@Slf4j
public class RedirectController {

    //protected HttpServletResponse response;

    @RequestMapping("/redirect")
    public void redirectUrl(HttpServletResponse response) throws IOException {
        String Url = "https://www.baidu.com";
        response.sendRedirect(Url);
    }

    @RequestMapping("/acceptRedirect")
    public void acceptRedirect() {

    }
}
