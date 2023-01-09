package com.catppuccin;

import java.util.Objects;

/**
 * A pair of two values.
 *
 * @param <T> the first type.
 * @param <U> the second type.
 */
public final class Pair<T, U> {
    private final T key;
    private final U value;

    Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Pair<?, ?> that = (Pair<?, ?>) obj;
        return Objects.equals(this.key, that.key) &&
            Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Pair[" +
            "key=" + key + ", " +
            "value=" + value +
            ']';
    }
}
