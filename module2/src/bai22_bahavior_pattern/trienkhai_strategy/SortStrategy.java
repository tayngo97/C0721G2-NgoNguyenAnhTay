package bai22_bahavior_pattern.trienkhai_strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
