/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2023 by Imtiyaz Allam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.asteroid.math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class contains functions to perform operations based on Sets
 *
 * @author Imtiyaz Allam
 * @param <E> the type of elements in this set
 */
public class Set<E> {

    /**
     * List containing all the elements of the set
     */
    private final List<E> setList = new ArrayList();

    /**
     * Universal set for this instance of set (required to find complement)
     */
    private List<E> universalSet = new ArrayList<>();

    /**
     * Checks for existence of an item in the set
     *
     * @param item item to check for presence in the set
     * @return True if the item is in the set else returns false
     */
    public boolean contains(E item) {
        return this.setList.contains(item);
    }

    /**
     * Assigns a universal set to this instance of set
     *
     * @param universalSet Instance of set that is to be assigned as universal
     * set of this instance of Set
     */
    public void setUniversal(Set<E> universalSet) {
        if (universalSet.isSupersetOf(this)) {
            if (universalSet.size() == 0) {
                throw new EmptyUniversalSetException("Cannot assign an empty universal set");
            }
            this.universalSet = universalSet.setList;
        } else {
            throw new InvalidUniversalSet();
        }
    }

    /**
     * Add an item to this instance of Set. <br>NOTE: If a universal set exists
     * and it doesn't contains the given item then the item is not added and
     * returns false to represent that the item is not added to the Set
     *
     * @param item Item that is to be added to Set
     * @return <code>true</code> if the item is added to the set else
     * <code>false</code>
     */
    public boolean add(E item) {
        if (universalSet != null) {
            if (!universalSet.contains(item)) {
                return false;
            }
        }
        if (setList.contains(item)) {
            return false;
        } else {
            setList.add(item);
        }
        return true;
    }

    /**
     * returns the size of the Set
     *
     * @return Size of the set
     */
    public int size() {
        return setList.size();
    }

    /**
     * Returns the item at the respective index. <br>NOTE: The indexing of the
     * item is based on when it was added. If the item is added at the first
     * then its index is 0, the second one is indexed as 1 and so on.
     *
     * @param index index to access the item
     * @return item at the respective index
     */
    public E get(int index) {
        return setList.get(index);
    }

    /**
     * Add an array of elements in the set
     *
     * @param items Array of items that is to be added
     * @return Number of items that are added to the set
     */
    public int addAll(E[] items) {
        int itemsAdded = 0;
        for (E item : items) {
            if (this.add(item)) {
                itemsAdded++;
            }
        }
        return itemsAdded;
    }

    /**
     * Add an sequence of elements in the set
     *
     * @param items Items that is to be added
     * @return Number of items that are added to the set
     */
    public int adds(E... items) {
        return addAll(items);
    }

    /**
     * Add an <code>Collection</code> of elements in the set
     *
     * @param items <code>Collection</code> of items that is to be added
     * @return Number of items that are added to the set
     */
    public int addAll(Collection<E> items) {
        int itemsAdded = 0;
        for (E item : items) {
            if (this.add(item)) {
                itemsAdded++;
            }
        }
        return itemsAdded;
    }

    /**
     * Generates power set of current instance of set. (Power Set is the set of
     * all subset of a set including empty set and the set itself)
     *
     * @return Power Set of the current instance of the set
     */
    public Set<Set<E>> getPowerSet() {
        Set<Set<E>> powerSet = new Set();
        long pow_set_size = (long) Math.pow(2, setList.size());
        for (int counter = 0; counter < pow_set_size; counter++) {
            Set<E> subset = new Set();
            for (int j = 0; j < setList.size(); j++) {
                if ((counter & (1 << j)) > 0) {
                    subset.add(setList.get(j));
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    /**
     * Returns a string representation of the object.
     *
     * @apiNote In general, the {@code toString} method returns a string that
     * "textually represents" this object. The result should be a concise but
     * informative representation that is easy for a person to read.
     *
     * @return String representation of the Set instance
     */
    @Override
    public String toString() {
        if (setList.isEmpty()) {
            return "{}";
        }
        String str = "{" + setList.get(0);
        for (int i = 1; i < setList.size(); i++) {
            str = str + ", " + setList.get(i);
        }
        return str + "}";
    }

    /**
     * Creates and returns a copy of this Set.
     *
     * @return Clone of the current instance of Set
     */
    @Override
    public Set<E> clone() {
        Set<E> set = new Set();
        for (int i = 0; i < setList.size(); i++) {
            set.add(setList.get(i));
        }
        return set;
    }

    /**
     * Returns union (Union of set refers to the set that is the combination of
     * both the set) of two sets
     *
     * @param set The second Set
     * @return Union of this instance of set and the function argument
     * <code>set</code>
     */
    public Set<E> union(Set<E> set) {
        Set<E> unionSet = this.clone();
        for (int i = 0; i < set.size(); i++) {
            unionSet.add(set.get(i));
        }
        return unionSet;
    }

    /**
     * Returns intersection (Intersection of set refers to the set that is
     * formed from the common elements of the two set) of two sets
     *
     * @param set The second Set
     * @return Intersection of this instance of set and the function argument
     * <code>set</code>
     */
    public Set<E> intersection(Set<E> set) {
        Set<E> intersectionSet = new Set<>();
        for (int i = 0; i < set.size(); i++) {
            if (this.contains(set.get(i))) {
                intersectionSet.add(set.get(i));
            }
        }
        for (int i = 0; i < this.size(); i++) {
            if (set.contains(this.get(i))) {
                intersectionSet.add(this.get(i));
            }
        }
        return intersectionSet;
    }

    /**
     * Generates complement (Complement refers to set that are not in the Set)
     * of the Set. <br>NOTE: Complements requires a universal set to be
     * assigned. If the instance of <code>Set</code> doesn't contains a
     * universal set then an exception is raised
     *
     * @return Complement of the Set
     */
    public Set<E> getComplement() {
        if (universalSet.isEmpty()) {
            throw new EmptyUniversalSetException();
        }
        Set<E> complement = new Set();
        for (int i = 0; i < universalSet.size(); i++) {
            if (!this.contains(universalSet.get(i))) {
                complement.add(universalSet.get(i));
            }
        }
        return complement;
    }

    /**
     * Checks if argument <code>set</code> is a perfect superset of the current
     * instance of Set (Perfect Superset refers to subset which is not the same
     * as its subset)
     *
     * @param set Set to check if it is a perfect superset
     * @return <code>true</code> if the given set is perfect superset of this
     * instance of this Set else <code>false</code>
     */
    public boolean isPerfectSupersetOf(Set<E> set) {
        if (set.size() > this.size()) {
            return false;
        }
        for (int i = 0; i < set.size(); i++) {
            if (!this.contains(set.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if argument <code>set</code> is a perfect subset of the current
     * instance of Set (Perfect subset refers to subset which is not the same as
     * its superset)
     *
     * @param set Set to check if it is a perfect subset
     * @return <code>true</code> if the given set is perfect subset of this
     * instance of this Set else <code>false</code>
     */
    public boolean isPerfectSubsetOf(Set<E> set) {
        if (set.size() < this.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            if (!set.contains(this.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if argument <code>set</code> is a superset of the current instance
     * of Set
     *
     * @param set Set to check if it is a superset
     * @return <code>true</code> if the given set is superset of this instance
     * of this Set else <code>false</code>
     */
    public boolean isSupersetOf(Set<E> set) {
        return this.isPerfectSupersetOf(set) || this.equals(set);
    }

    /**
     * Checks if argument <code>set</code> is a subset of the current instance
     * of Set
     *
     * @param set Set to check if it is a subset
     * @return <code>true</code> if the given set is subset of this instance of
     * this Set else <code>false</code>
     */
    public boolean isSubsetOf(Set<E> set) {
        return this.isPerfectSubsetOf(set) || this.equals(set);
    }

    /**
     * Generates and returns Cartesian Product of two set. Here the current
     * instance is the first set and the argument of this function is the second
     * set
     *
     * @param set The second set to find the Cartesian Product
     * @return Cartesian product
     */
    public Set<ArrayList> cartesianProduct(Set set) {
        Set product = new Set();
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < set.size(); j++) {
                ArrayList arr = new ArrayList();
                arr.add(this.get(i));
                arr.add(set.get(j));
                product.add(arr);
            }
        }
        return product;
    }

    /**
     * Calculate difference of two set. Here the argument passed in the function
     * is the second set for the operation
     *
     * @param b the second set for the operation
     * @return difference between two set
     */
    public Set<E> difference(Set<E> b) {
        Set<E> s = this.clone();
        for (int i = 0; i < this.size(); i++) {
            if (b.contains(this.setList.get(i))) {
                s.setList.remove(this.setList.get(i));
            }
        }
        return s;
    }

    /**
     * Calculate symmetric difference between two set. (Symmetric difference is
     * A-B U B-A)
     *
     * @param b Another set to find symmetric difference
     * @return Symmetric difference of two sets
     */
    public Set<E> symmetricDifference(Set<E> b) {
        Set<E> s1 = this.difference(b);
        Set<E> s2 = b.difference(this);
        return s2.union(s1);
    }

}
