package ui;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {
    
    private final CurrencySet currencySet;
    private final Exchange exchange;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
        this.exchange = new Exchange(new Money(300, new Currency("EUR","Euro","€")), 
                                     new Currency("USD","Dollar","$"));
    }

    public Exchange getExchange() {
        return exchange;
    }
    
}
