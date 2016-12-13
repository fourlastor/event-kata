package com.fourlastor.bankapp;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Money {

    static Money of(float amount, Currency currency) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount <= 0");
        }

        return new AutoValue_Money(amount, currency);
    }

    abstract float amount();

    abstract Currency currency();
}
