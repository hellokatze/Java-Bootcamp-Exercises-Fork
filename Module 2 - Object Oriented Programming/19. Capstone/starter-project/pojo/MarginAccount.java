package pojo;

import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {

  private BigDecimal margin;

  public MarginAccount(String id, BigDecimal margin) {
    super(id);
    setMargin(this.margin);
  }

  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

}
