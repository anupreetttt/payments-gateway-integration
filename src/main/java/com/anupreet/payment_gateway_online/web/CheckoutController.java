package com.anupreet.payment_gateway_online.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutController {

    @GetMapping("/")
    public String preview() {
        return "preview";
    }
}
