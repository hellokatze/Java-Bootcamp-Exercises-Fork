package service;

import pojo.Account;
import pojo.Credit;
import repository.AccountRepository;

public class CreditService {

  AccountRepository accountRepository;

  public CreditService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public void createAccount(Credit account) {
    this.accountRepository.createAccount(account);
    ;
  }

  public Account retrieveAccount(String id) {
    return (Credit) this.accountRepository.retrieveAccount(id);
  }

  public void updateAccount(Credit account) {
    this.accountRepository.updateAccount(account);
    ;
  }

  public void deleteAccount(String id) {
    this.accountRepository.deleteAccount(id);
  }
}
