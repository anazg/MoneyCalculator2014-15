package moneycalculator.process;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;

public class Exchanger {
    
    public static Money exchange(Money money, ExchangeRate exRate){
        return new Money((money.getAmount() * exRate.getRate()), exRate.getTo());
    }
}
