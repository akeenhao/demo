package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/random")
public class RandomApi {
    @GetMapping("/getOne")
    public int getOne(int req) {
        Random random = new Random();
        return random.nextInt(req) + 1;
    }

}
