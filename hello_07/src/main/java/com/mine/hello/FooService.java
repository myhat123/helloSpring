package com.mine.hello;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class FooService {
     
    @Autowired
    private FooFormatter fooFormatter;
 
    public String doStuff() {
        return fooFormatter.format();
    }
}