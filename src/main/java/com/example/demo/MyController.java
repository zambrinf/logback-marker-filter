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
    private final Marker readMarker = MarkerFactory.getMarker("read");
    private final Marker writeMarker = MarkerFactory.getMarker("write");

    @GetMapping("/")
    public String getHelloWorld() {
        log.info(readMarker, "Requested Hello World Read endpoint");
        return "Hello World!";
    }

    @GetMapping("/hi")
    public String getHi() {
        log.info(writeMarker, "Requested Hi write endpoint");
        return "Hi World!";
    }
}
