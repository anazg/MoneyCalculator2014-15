package moneycalculator.model;

public class ExchangeRate {
    
    private final Currency from;
    private final Currency to;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, double rate) {
        this.rate = rate;
        this.from = from;
        this.to = to;
    }

    public double getRate() {
        return rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }
    
}
