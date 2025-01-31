package org.example.service;

import org.example.model.entity.Account;

public interface AccountService {
    void transferMoney(long fromAccountId, long toAccountId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
