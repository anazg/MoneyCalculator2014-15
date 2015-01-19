package moneycalculator.control;

import moneycalculator.model.CurrencySet;
import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.process.Exchanger;
import moneycalculator.ui.ExchangeDialog;
import moneycalculator.ui.MoneyDisplay;

public class ExchangeOperation {

    private final ExchangeDialog dialog;

    public ExchangeOperation(ExchangeDialog dialog) {
        this.dialog = dialog;
    }

    public void execute(CurrencySet currencySet){
        System.out.println(dialog.getExchange().getMoney().getAmount());
        System.out.println(dialog.getExchange().getMoney().getCurrency().getCode());
        System.out.println(dialog.getExchange().getCurrency().getCode());
    
        Exchange exchange = readExchange(currencySet);
        ExchangeRate exchangeRate = ExchangeRateLoader.load(exchange.getMoney().getCurrency(),
                                    exchange.getCurrency());
        Money result = Exchanger.exchange(exchange.getMoney(), exchangeRate);
        new MoneyDisplay().display(result);
    }
        
    public ExchangeDialog getDialog() {
        return dialog;
    }

    private static Exchange readExchange(CurrencySet currencySet){
        return new ExchangeDialog(currencySet).getExchange();
    }
}
