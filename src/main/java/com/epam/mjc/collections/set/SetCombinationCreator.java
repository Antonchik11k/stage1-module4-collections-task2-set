package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        // Find the intersection of the first and the second sets
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        // Remove any elements that are also in the third set
        intersection.removeAll(thirdSet);

        // Add unique elements from the third set
        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                intersection.add(element);
            }
        }

        // The resultSet is now the combination as per the requirements
        return intersection;
    }
}
