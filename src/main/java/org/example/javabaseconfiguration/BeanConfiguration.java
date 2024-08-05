package org.example.javabaseconfiguration;

import org.example.model.repository.AccountRepository;
import org.example.model.repository.AccountRepositoryImpl;
import org.example.service.AccountService;
import org.example.service.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepository accountDao() {
        AccountRepositoryImpl bean = new AccountRepositoryImpl();
        return bean;
    }
}
