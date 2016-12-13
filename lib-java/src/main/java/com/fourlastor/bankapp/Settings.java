package com.fourlastor.bankapp;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Settings {

    static Builder builder() {
        return new AutoValue_Settings.Builder();
    }

    abstract Balance balance();

    abstract Currency currency();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder balance(Balance balance);

        abstract Builder currency(Currency currency);

        abstract Settings build();
    }
}
