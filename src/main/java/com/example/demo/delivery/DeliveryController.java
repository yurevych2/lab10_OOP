package com.example.demo.delivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @GetMapping("/test")
    public String feedback() {
        return "Here will be delivery.";
    }
}
