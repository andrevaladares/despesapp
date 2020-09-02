package com.vldrs.despesapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    static final String template = "Hello, %s!"
    final AtomicLong counter = new AtomicLong()

    @GetMapping("/despesapp/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")
            String name) {
        new Greeting(id: counter.incrementAndGet(), content: String.format(template, name))
    }
}
