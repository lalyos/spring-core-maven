package com.epam.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringBootstrap {

    /**
     * @param args
     */
    public static void main(String[] args) {        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        
        SpringApp app = ctx.getBean(SpringApp.class);
        app.say();
    }

}
