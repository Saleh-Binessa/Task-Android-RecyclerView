package com.example.currencies_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currencies_app.adapter.CurrenciesAdapter;
import com.example.currencies_app.adapter.Currency;
import com.example.currencies_app.repositories.CurrenciesRepository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecyclerView;
    ArrayList<Currency> currencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencies = CurrenciesRepository.getInstence().generateDummyCurrency();

        CurrenciesAdapter currenciesAdapter = new CurrenciesAdapter(currencies);
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        currencyRecyclerView.setAdapter(currenciesAdapter);
    }
}