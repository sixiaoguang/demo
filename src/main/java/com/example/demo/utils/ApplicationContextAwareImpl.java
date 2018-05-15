package com.example.demo.utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class ApplicationContextAwareImpl implements ApplicationContextAware{
    private static ApplicationContext context = null;


    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        ApplicationContextAwareImpl.context = ctx;
    }

    public static ApplicationContext getApplicationContext(){
        return context;
    }

    public static <T> T getBean(Class<T> clz) {
        return (T) getApplicationContext().getBean(clz);
    }

    public static Object getBean(String beanName) {
        return getApplicationContext().getBean(beanName);
    }

}