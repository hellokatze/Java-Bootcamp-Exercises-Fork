import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;

public class Main {
  static Path[] paths = new Path[] { Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt") };

  static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
  static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
  static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

  public static void loadTradeAccounts() throws IOException {
    Files.lines(paths[0])
      .forEach(line -> {
        String[] words = line.split(" ");
        if (words[0].equals("CASH")) {
          cashAccountService.createTradeAccount(new CashAccount(words[1], new BigDecimal(words[2])));
        } else {
          marginAccountService.createTradeAccount(new MarginAccount(words[1], new BigDecimal(words[2])));
        }
      });
  }

  public static void applyTransactions() throws IOException {
    Files.lines(paths[1])
      .forEach(line -> {
        String[] words = line.split(" ");
        if (words[0].equals("CASH") && words[2].equals("DEPOSIT")) {
          cashAccountService.deposit(words[1], new BigDecimal(words[3]));
        } else if (words[0].equals("CASH") && words[2].equals("WITHDRAWAL")) {
          cashAccountService.withdraw(words[1], new BigDecimal(words[3]));
        } else if (words[0].equals("MARGIN") && words[2].equals("DEPOSIT")) {
          marginAccountService.deposit(words[1], new BigDecimal(words[3]));
        } else if (words[0].equals("MARGIN") && words[2].equals("WITHDRAWAL")) {
          marginAccountService.withdraw(words[1], new BigDecimal(words[3]));
        }
      });
  }
}
