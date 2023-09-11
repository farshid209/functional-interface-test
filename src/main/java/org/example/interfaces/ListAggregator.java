package org.example.interfaces;

import java.util.List;

@FunctionalInterface
public interface ListAggregator<T, R> {
    R aggregate(List<T> list);
}
