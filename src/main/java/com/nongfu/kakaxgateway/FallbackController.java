package com.nongfu.kakaxgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback() {
        return "I'm Spring Cloud Gateway fallback.";
    }
}
