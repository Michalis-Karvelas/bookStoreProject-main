package com.groupproject.services;

import com.groupproject.entities.Account;
import com.groupproject.requests.AccountRequest;
import java.util.List;

public interface IAccountService {

    //list for all accounts
    List<Account> getAll();

    //account with id
    Account getAccountById(Long id);

    //new account
    boolean createAccount(AccountRequest request);

    //update account with id
    Account updateAccount(Long id, AccountRequest request);

    //delete account with id
    boolean deleteById(Long id);

}
