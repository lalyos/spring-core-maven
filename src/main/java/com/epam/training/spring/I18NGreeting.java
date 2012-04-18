package com.epam.training.spring;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class I18NGreeting implements GreetingService, ApplicationContextAware {

    private ApplicationContext ctx;

    @Value("${msg.key}")
    private String messageName;
    @Value("${greeting.locale}")
    private Locale locale;
    private Logger logger = LoggerFactory.getLogger(I18NGreeting.class);
    
    @Override
    public void sayGreeting() {
        String message = ctx.getMessage(messageName, null, locale);
        System.out.println("[i18n] msg:" + message);
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        
        this.ctx = ctx;
        logger.debug("setApplicationContext() called.");
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
