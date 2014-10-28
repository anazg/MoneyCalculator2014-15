package application;

import model.CurrencySet;
import persistence.CurrencySetLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet result = new CurrencySetLoader.load();
        
    }

}
