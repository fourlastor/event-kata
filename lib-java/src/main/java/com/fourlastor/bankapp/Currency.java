package com.fourlastor.bankapp;

public enum Currency {
    EURO(1.3f),
    STERLING(1.2f),
    DOLLARS(1f);

    private final float ratio;

    Currency(float ratio) {
        this.ratio = ratio;
    }

    public float ratio() {
        return ratio;
    }
}
