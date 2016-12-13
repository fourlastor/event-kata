package com.fourlastor.bankapp;

public enum Currency {
    GBP(1.2f),
    USD(1f);

    private final float ratio;

    Currency(float ratio) {
        this.ratio = ratio;
    }

    public float ratio() {
        return ratio;
    }
}
