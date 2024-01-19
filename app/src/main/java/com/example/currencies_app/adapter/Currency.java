package com.example.currencies_app.adapter;

public class Currency {
    private String currencyName;
    private double exchangeRate;
    private String currencyCode;
    private int countryFlag;

    public Currency(int countryFlag, String currencyName, double exchangeRate, String currencyCode) {
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.currencyCode = currencyCode;
        this.countryFlag = countryFlag;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public int getCountryFlag() {
        return countryFlag;
    }
}
