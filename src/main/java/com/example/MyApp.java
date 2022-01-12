package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);
        MessageService messageService2 = ctx.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode() + " " + messageService2.hashCode());
        System.out.println("Czy sa rowne?: " + messageService.equals(messageService2));
    }
}
