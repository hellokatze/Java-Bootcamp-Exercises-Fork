package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
// must override the methods in TradeAccountsService

  private TradeAccountRepository tradeAccountRepository;

  public CashAccountService(TradeAccountRepository repository) {
    this.tradeAccountRepository = repository;
  }

  public void createTradeAccount(CashAccount account) {
    this.tradeAccountRepository.createTradeAccount(account);
  }

  public CashAccount retrieveTradeAccount(String id) {
    return (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
  }

  public void updateTradeAccount(CashAccount account) {
    this.tradeAccountRepository.updateTradeAccount(account);
  }

  public void deleteTradeAccount(String id) {
    this.tradeAccountRepository.deleteTradeAccount(id);
  }

  @Override
  public void deposit(String id, BigDecimal amount) {
    CashAccount cashAccount = retrieveTradeAccount(id);
    cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
    this.tradeAccountRepository.updateTradeAccount(cashAccount);
  }

  @Override
  public void withdraw(String id, BigDecimal amount) {
    CashAccount cashAccount = retrieveTradeAccount(id);
    cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
    this.tradeAccountRepository.updateTradeAccount(cashAccount);
  }

}
