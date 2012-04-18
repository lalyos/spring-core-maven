package com.epam.training.spring;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class I18NGreeting implements GreetingService, ApplicationContextAware {

    private ApplicationContext ctx;

    private String messageName;
    private Locale locale;
    
    @Override
    public void sayGreeting() {
        String message = ctx.getMessage(messageName, null, locale);
        System.out.println("[i18n] msg:" + message);
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        this.ctx = ctx;
        
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

}
