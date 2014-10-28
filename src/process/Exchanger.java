package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {
    
    public Money exchange(Money money, ExchangeRate exRate){
        return new Money((money.getAmount() * exRate.getRate()), exRate.getTo());
    }
}
