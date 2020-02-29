package com.lydia.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventListenerDemo {

    @Autowired
    private StudentAddBean studentAddBean;

    @Test
    public void test() {
        studentAddBean.addStudent("张三");
        studentAddBean.addStudent("李四");
    }
}
