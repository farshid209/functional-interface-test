package org.example.interfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T value);
}
