package model;

import java.util.HashMap;

public class CurrencySet {

    private final HashMap<String,Currency> set;

    public CurrencySet(Currency[] set) {
        this.set = new HashMap<>();
        for (Currency currency : set) {
            this.set.put(currency.getCode(), currency);
        }
    }

    public HashMap<String,Currency> getSet() {
        return set;
    }
     
}
