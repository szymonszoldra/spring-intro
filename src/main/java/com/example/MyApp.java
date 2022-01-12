package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode() + " " + messageService2.hashCode());
        System.out.println("Czy sa rowne?: " + messageService.equals(messageService2));

        applicationContext.close();
    }
}
