package com.lydia.event;

import org.springframework.context.ApplicationEvent;

public class StudentAddEvent extends ApplicationEvent {

    /**
     * 学生姓名
     */
    private String name;

    public StudentAddEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
