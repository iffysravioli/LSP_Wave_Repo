package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;


/**
 * The IntegerSet class represents a collection of unique integers.
 * It provides various set operations like union, intersection, and difference. wave
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor that creates an empty set.
     */
    public IntegerSet() {}

    /**
     * Constructor that initializes the set with a list of integers.
     * @param set the list of integers to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares this set with another object for equality.
     * Two sets are considered equal if they contain the same elements, regardless of order.
     * @param o the object to compare to
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;
    }

    /**
     * Checks whether the set contains a specific value.
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return the largest element
     * @throws IllegalStateException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().max(Integer::compareTo).get();
    }

    /**
     * Returns the smallest element in the set.
     * @return the smallest element
     * @throws IllegalStateException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().min(Integer::compareTo).get();
    }

    /**
     * Adds a new element to the set if it is not already present.
     * @param item the element to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes a specific element from the set if it is present.
     * @param item the element to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     * @param intSetb the set to union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * Modifies this set to contain only the elements found in both sets.
     * @param intSetb the set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Computes the difference between this set and another set.
     * Modifies this set to remove elements found in the other set.
     * @param intSetb the set to compute the difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Computes the complement of this set with respect to another set.
     * @param intSetb the set to compare with for complement
     */
    public void complement(IntegerSet intSetb) {
        for (int num : set) {
            if (intSetb.contains(num)) {
                set.remove(Integer.valueOf(num));
            }
        }
    }

    /**
     * Checks whether the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return a string containing the elements of the set
     */
    public String toString() {
        return set.toString();
    }
}
