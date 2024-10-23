package com.anupreet.payment_gateway_online.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class CheckoutController {

    @Value("${Adyen_CLIENT_KEY}")
    private String clientKey;
    @GetMapping("/")
    public String preview() {
        return "preview";
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("clientKey", clientKey);
        return "checkout";
    }

}
