package com.fourlastor.bankapp;

import org.junit.Before;
import org.junit.Test;

import static com.fourlastor.bankapp.Currency.GBP;
import static com.fourlastor.bankapp.Currency.USD;
import static org.fest.assertions.api.Assertions.assertThat;

public class CreditDebitFeature {

    private Bank bank;

    @Before
    public void setUp() throws Exception {
        Settings settings = Settings.builder()
                .balance(Balance.of(0, USD))
                .currency(USD)
                .build();

        bank = new Bank(settings);
    }

    @Test
    public void credit() throws Exception {
        bank.credit(Money.of(1, USD));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(1, USD));
    }

    @Test
    public void debit() throws Exception {
        bank.debit(Money.of(1, USD));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(-1, USD));
    }

    @Test
    public void creditThenDebit() throws Exception {
        bank.credit(Money.of(2, USD));
        bank.debit(Money.of(1, USD));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(1, USD));
    }

    @Test
    public void debitThenCredit() throws Exception {
        bank.debit(Money.of(1, USD));
        bank.credit(Money.of(2, USD));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(1, USD));
    }

    @Test
    public void creditInDifferentCurrency() throws Exception {
        int amount = 1;
        bank.credit(Money.of(amount, GBP));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(amount * GBP.ratio(), USD));
    }

    @Test
    public void creditsInDifferentCurrency() throws Exception {
        int amount = 1;
        bank.credit(Money.of(amount, GBP));
        bank.credit(Money.of(1, USD));

        Balance balance = bank.balance();
        float expectedAmount = (amount * GBP.ratio()) + 1;
        assertThat(balance).isEqualTo(Balance.of(expectedAmount, USD));
    }

    @Test
    public void debitInDifferentCurrency() throws Exception {
        int amount = 1;
        bank.debit(Money.of(amount, GBP));

        Balance balance = bank.balance();
        assertThat(balance).isEqualTo(Balance.of(-amount * GBP.ratio(), USD));
    }
}
