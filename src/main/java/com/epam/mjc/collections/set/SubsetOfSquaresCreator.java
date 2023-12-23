package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squares = new TreeSet<>();
        // Add the square of each element in the source list to the TreeSet
        for (Integer number : sourceList) {
            squares.add(number * number);
        }
        // Return the subset of squares in the given range
        // Inclusive true for both bounds, as per the requirement
        return squares.subSet(lowerBound, true, upperBound, true);
    }
}
