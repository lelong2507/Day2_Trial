package org.example.model.repository;

import org.example.model.entity.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository{
    private Map<Long, Account> accountsMap = new HashMap<>();
    {
        Account ac1 =  new Account(1,"Long",25.0);
        Account ac2 =  new Account(2,"Neyu",20.0);

        accountsMap.put(ac1.getId(), ac1);
        accountsMap.put(ac2.getId(), ac2);
    };

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }
}
