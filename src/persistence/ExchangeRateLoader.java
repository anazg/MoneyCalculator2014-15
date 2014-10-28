package persistence;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
        
    Currency euro = new Currency("EUR","Euro","€");
    Currency dollar = new Currency("USD","Dólar americano","€");
    Currency pound = new Currency("GBP","Libra esterlina","£");

    public void load(){
        ExchangeRate euroToDollar = new ExchangeRate(euro,dollar,1.2);
        ExchangeRate euroToPound = new ExchangeRate(euro,pound,0.7);
        ExchangeRate dollarToEuro = new ExchangeRate(dollar,euro,0.8);
    }
}
