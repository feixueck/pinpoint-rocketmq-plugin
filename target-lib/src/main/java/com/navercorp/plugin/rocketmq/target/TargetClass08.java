package com.navercorp.plugin.rocketmq.target;

public class TargetClass08 {
    public String targetMethod() {
        return targetMethod("PINPOINT");
    }
    
    public String targetMethod(String name) {
        return "Hello " + name;
    }
}