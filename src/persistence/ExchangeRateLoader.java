package persistence;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
        
    public ExchangeRate load(Currency from, Currency to){
        return new ExchangeRate(from,to,1.2);
    }
}
