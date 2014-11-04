package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader.load();
        new ExchangeOperation.execute(currencySet);
        
    }

}
