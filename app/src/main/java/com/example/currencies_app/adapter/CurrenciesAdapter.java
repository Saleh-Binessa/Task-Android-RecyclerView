package com.example.currencies_app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currencies_app.R;

import java.util.ArrayList;

public class CurrenciesAdapter extends RecyclerView.Adapter<CurrenciesAdapter.CurrencyViewHolder> {
    ArrayList<Currency> currenciesList;

    public CurrenciesAdapter(ArrayList<Currency> currenciesList) {
        this.currenciesList = currenciesList;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.currency_item,
                parent, false
        );
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currency currency = currenciesList.get(position);
        holder.countryFlagImageView.setImageResource(currency.getCountryFlag());
        holder.currencyNameTextView.setText(currency.getCurrencyName());
        holder.exchangeRateTextView.setText(String.valueOf(currency.getExchangeRate()));
        holder.currencyCodeTextView.setText(currency.getCurrencyCode());
    }

    @Override
    public int getItemCount() {
        return currenciesList.size();
    }

    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView currencyNameTextView;
        TextView exchangeRateTextView;
        TextView currencyCodeTextView;
        ImageView countryFlagImageView;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            countryFlagImageView = itemView.findViewById(R.id.countryFlagTextView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
            exchangeRateTextView = itemView.findViewById(R.id.exchangeRateTextView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);
        }
    }
}
