package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.TradeAccount;

public class TradeAccountRepository {

  private Map<String, TradeAccount> datastore = new HashMap<>();

  public void createTradeAccount(TradeAccount tradeAccount) {
    this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
  }

  public TradeAccount retrieveTradeAccount(String id) {
    if (datastore.containsKey(id)) {
      return this.datastore.get(id).clone();
    } else {
      return null;
    }
  }

  public void updateTradeAccount(TradeAccount tradeAccount) {
    this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
  }

  public void deleteTradeAccount(String id) {
    this.datastore.remove(id);
  }
}
