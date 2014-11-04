package model;

import java.util.HashMap;

public class CurrencySet {

    private final HashMap<String,Currency> set;

    public CurrencySet() {
        this.set = new HashMap<>();
    }

    public HashMap<String,Currency> getSet() {
        return set;
    }
    
    public void addCurrency(String code, Currency currency){
        set.put(code, currency);
    }     
}
