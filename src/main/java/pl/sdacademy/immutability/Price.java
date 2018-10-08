package pl.sdacademy.immutability;

class Price {
    private int value;
    private Currency currency;

    Price(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return value + currency.toString();
    }
}