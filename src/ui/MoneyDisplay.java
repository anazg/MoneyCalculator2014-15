package ui;

import model.Money;

public class MoneyDisplay {

    public void display(Money result) {
        System.out.println(result.getAmount() + result.getCurrency().getSymbol());
    }

}
