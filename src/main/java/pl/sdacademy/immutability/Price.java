package pl.sdacademy.immutability;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return value == price.value &&
                currency == price.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}