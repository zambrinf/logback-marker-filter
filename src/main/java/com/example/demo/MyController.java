package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final Marker orangeMarker = MarkerFactory.getMarker("orange");
    private final Marker appleMarker = MarkerFactory.getMarker("apple");

    @GetMapping("/")
    public String getHelloWorld() {
        log.info(orangeMarker, "Requested Hello World with orange marker");
        return "Hello World!";
    }

    @GetMapping("/hi")
    public String getHi() {
        log.info(appleMarker, "Requested Hi apple marker");
        return "Hi World!";
    }
}
