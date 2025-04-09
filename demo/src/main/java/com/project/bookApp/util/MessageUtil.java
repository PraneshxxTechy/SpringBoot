package com.project.bookApp.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {
    @Value("${app.greeting}")
    private String greeting;
    public String getGreeting(){
        return greeting;
    }
}
