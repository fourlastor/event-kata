
package com.fourlastor.bankapp;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Money extends Money {

  private final float amount;
  private final Currency currency;

  AutoValue_Money(
      float amount,
      Currency currency) {
    this.amount = amount;
    if (currency == null) {
      throw new NullPointerException("Null currency");
    }
    this.currency = currency;
  }

  @Override
  float amount() {
    return amount;
  }

  @Override
  Currency currency() {
    return currency;
  }

  @Override
  public String toString() {
    return "Money{"
        + "amount=" + amount + ", "
        + "currency=" + currency
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Money) {
      Money that = (Money) o;
      return (Float.floatToIntBits(this.amount) == Float.floatToIntBits(that.amount()))
           && (this.currency.equals(that.currency()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Float.floatToIntBits(this.amount);
    h *= 1000003;
    h ^= this.currency.hashCode();
    return h;
  }

}
