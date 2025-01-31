package org.example;

import org.example.service.AccountService;
import org.example.annotationconfiguration.AccountService2Impl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansAnnotation.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService2Impl.class);

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
//        accountService.depositMoney(1, 10.0);
        System.out.println("============================");
        System.out.println("Deposit 10$ to account with userName: Long");
        System.out.println("Deposit success" + accountService.getAccount(1).toString());
    }
}
