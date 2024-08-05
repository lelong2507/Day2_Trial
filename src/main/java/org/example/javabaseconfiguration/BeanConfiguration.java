package org.example.javabaseconfiguration;

import org.example.model.repository.AccountRepository;
import org.example.annotationconfiguration.AccountRepository2Impl;
import org.example.service.AccountService;
import org.example.annotationconfiguration.AccountService2Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService() {
        AccountService2Impl bean = new AccountService2Impl();
        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepository accountDao() {
        AccountRepository2Impl bean = new AccountRepository2Impl();
        return bean;
    }
}
