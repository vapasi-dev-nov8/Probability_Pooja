package com.vapasi.statistics;

import java.util.Objects;

public class CoinTossEvents {
    double value;
    public CoinTossEvents(double value) {
        this.value = value;
    }

    public CoinTossEvents probabilityOfTwoEvents(CoinTossEvents secondEvent) {
        return new CoinTossEvents(this.value * secondEvent.value);
    }

    public CoinTossEvents probabilityOfNotAnEvent() {
        return new CoinTossEvents(1 - this.value);
    }

    public CoinTossEvents probabilityOfEitherOfTwoEvents(CoinTossEvents secondEvent) {
        return new CoinTossEvents(this.value + secondEvent.value - (this.value * secondEvent.value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinTossEvents that = (CoinTossEvents) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
