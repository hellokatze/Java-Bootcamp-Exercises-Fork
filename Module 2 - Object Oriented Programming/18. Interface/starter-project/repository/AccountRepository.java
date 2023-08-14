package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

public class AccountRepository {
    // only AccountRepository can access the datastore HashMap and perform CRUD operations on it.

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
      this.datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    public void updateAccount(Account account) {
      this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
      this.datastore.remove(id);
    }

}
