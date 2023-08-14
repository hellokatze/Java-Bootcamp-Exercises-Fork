package pojo;

import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {

  private BigDecimal margin;

  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

}
