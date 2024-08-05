package org.example.annotationconfiguration;

import org.example.model.entity.Account;
import org.example.model.repository.AccountRepository;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService2Impl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }


    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account acc =  accountRepository.find(accountId);
        acc.setBalance(acc.getBalance() + amount);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
