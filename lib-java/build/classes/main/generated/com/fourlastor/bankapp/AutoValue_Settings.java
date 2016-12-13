
package com.fourlastor.bankapp;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Settings extends Settings {

  private final Balance balance;
  private final Currency currency;

  private AutoValue_Settings(
      Balance balance,
      Currency currency) {
    this.balance = balance;
    this.currency = currency;
  }

  @Override
  Balance balance() {
    return balance;
  }

  @Override
  Currency currency() {
    return currency;
  }

  @Override
  public String toString() {
    return "Settings{"
        + "balance=" + balance + ", "
        + "currency=" + currency
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Settings) {
      Settings that = (Settings) o;
      return (this.balance.equals(that.balance()))
           && (this.currency.equals(that.currency()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.balance.hashCode();
    h *= 1000003;
    h ^= this.currency.hashCode();
    return h;
  }

  static final class Builder extends Settings.Builder {
    private Balance balance;
    private Currency currency;
    Builder() {
    }
    Builder(Settings source) {
      this.balance = source.balance();
      this.currency = source.currency();
    }
    @Override
    public Settings.Builder balance(Balance balance) {
      this.balance = balance;
      return this;
    }
    @Override
    public Settings.Builder currency(Currency currency) {
      this.currency = currency;
      return this;
    }
    @Override
    public Settings build() {
      String missing = "";
      if (balance == null) {
        missing += " balance";
      }
      if (currency == null) {
        missing += " currency";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Settings(
          this.balance,
          this.currency);
    }
  }

}
