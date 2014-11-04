package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySetLoader() {
    }
    
    public static CurrencySet load(){
        Currency euro = new Currency("EUR","Euro","€");
        Currency dollar = new Currency("USD","Dólar americano","€");
        CurrencySet currencySet = new CurrencySet();
        currencySet.addCurrency(euro.getCode(), euro);
        currencySet.addCurrency(dollar.getCode(), dollar);
        return currencySet;
    }
}
