package control;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistence.ExchangeRateLoader;
import process.Exchanger;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {

    public ExchangeOperation() {
    }
    
    public static void execute(CurrencySet currencySet){
        Exchange exchange= new ExchangeDialog(currencySet).getExchange();
        ExchangeRate exchangeRate = ExchangeRateLoader.load(exchange.getMoney().getCurrency(),
                                    exchange.getCurrency());
        Money result = Exchanger.exchange(exchange.getMoney(), exchangeRate);
        new MoneyDisplay().display(result);
    }

}
