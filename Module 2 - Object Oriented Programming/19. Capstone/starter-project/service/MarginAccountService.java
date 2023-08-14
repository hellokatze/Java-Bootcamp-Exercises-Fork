package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {

  private TradeAccountRepository tradeAccountRepository;

  public MarginAccountService(TradeAccountRepository repository) {
    this.tradeAccountRepository = repository;
  }

  public void createMarginAccount(MarginAccount account) {
    this.tradeAccountRepository.createTradeAccount(account);
  }

  public MarginAccount retrieveMarginAccount(String id) {
    return (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
  }

  public void updateMarginAccount(MarginAccount account) {
    this.tradeAccountRepository.updateTradeAccount(account);
  }

  public void deleteMarginAccount(String id) {
    this.tradeAccountRepository.deleteTradeAccount(id);
  }

  @Override
  public void deposit(String id, BigDecimal amount) {
    MarginAccount marginAccount = retrieveMarginAccount(id);
    marginAccount.setMargin(marginAccount.getMargin().add(amount));
    this.tradeAccountRepository.updateTradeAccount(marginAccount);
  }

  @Override
  public void withdraw(String id, BigDecimal amount) {
    MarginAccount marginAccount = retrieveMarginAccount(id);
    marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
    this.tradeAccountRepository.updateTradeAccount(marginAccount);
  }
}
