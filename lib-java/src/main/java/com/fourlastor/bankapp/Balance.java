package com.fourlastor.bankapp;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Balance {

    static Balance of(float amount, Currency currency) {
        return new AutoValue_Balance(amount, currency);
    }

    abstract float amount();
    abstract Currency currency();
}
