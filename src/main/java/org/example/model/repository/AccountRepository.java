package org.example.model.repository;

import org.example.model.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
