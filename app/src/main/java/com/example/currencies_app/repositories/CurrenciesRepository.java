package com.example.currencies_app.repositories;

import com.example.currencies_app.R;
import com.example.currencies_app.adapter.Currency;

import java.util.ArrayList;

public class CurrenciesRepository {
    private static CurrenciesRepository instence;

    private CurrenciesRepository() {
    }

    public static CurrenciesRepository getInstence() {
        if (instence == null)
            instence = new CurrenciesRepository();
        return instence;
    }

    int kuwaitFlag = R.drawable.kuwaitflag;
    int usaFlag = R.drawable.usaflag;
    int euroFlag = R.drawable.euroflag;

    public ArrayList<Currency> generateDummyCurrency() {
        ArrayList<Currency> currencies = new ArrayList<>();

        Currency currency1 = new Currency(kuwaitFlag, "Kuwaity Dinar", 3.3, "KWD");
        currencies.add(currency1);
        Currency currency2 = new Currency(usaFlag, "United States Dollar", 3.3, "USD");
        currencies.add(currency2);
        Currency currency3 = new Currency(euroFlag, "European euro", 3.3, "EUR");
        currencies.add(currency3);
        return currencies;
    }

}
