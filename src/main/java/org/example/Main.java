package org.example;

import org.example.javabaseconfiguration.BeanConfiguration;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        // Three way: Java Class Configuration, XML based, Java Annotation
//        // Way 1 : Java Class Configuration
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
//
//        System.out.println("============================");
//        System.out.println("Before tranfer");
//        System.out.println("Account tranfer: " + accountService.getAccount(1).toString());
//        System.out.println("Account give: " + accountService.getAccount(2).toString());
//
//        accountService.transferMoney(1,2,5.0);
//        System.out.println("============================");
//        System.out.println("After tranfer");
//        System.out.println("Account tranfer: " + accountService.getAccount(1).toString());
//        System.out.println("Account give: " + accountService.getAccount(2).toString());
//
//
//        System.out.println("============================");
//        System.out.println("After deposit with account has userName Long");
//        System.out.println(accountService.getAccount(1).toString());
//        accountService.depositMoney(1, 10.0);
//        System.out.println("============================");
//        System.out.println("Deposit 10$ to account with userName: Long");
//        System.out.println("Deposit success" + accountService.getAccount(1).toString());

        // Way 2 : With beans.xml
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        System.out.println("============================");
        System.out.println("Before tranfer");
        System.out.println("Account tranfer: " + accountService.getAccount(1).toString());
        System.out.println("Account give: " + accountService.getAccount(2).toString());

        accountService.transferMoney(1, 2, 5.0);
        System.out.println("============================");
        System.out.println("After tranfer");
        System.out.println("Account tranfer: " + accountService.getAccount(1).toString());
        System.out.println("Account give: " + accountService.getAccount(2).toString());


        System.out.println("============================");
        System.out.println("After deposit with account has userName Long");
        System.out.println(accountService.getAccount(1).toString());
        accountService.depositMoney(1, 10.0);
        System.out.println("============================");
        System.out.println("Deposit 10$ to account with userName: Long");
        System.out.println("Deposit success" + accountService.getAccount(1).toString());
    }
}