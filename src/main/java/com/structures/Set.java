package com.structures;

/*
    A Set is a collection that does not allow duplicate elements. Its main characteristics are:
        - Unique elements (no repetition allowed)
        - Order depends on the implementation (HashSet: unordered, TreeSet: ordered)
        - Inherits from Collection, but does not have indexes like List
        - No index-based access
 */
public interface Set<E> {

    // Basic Operations
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E element);
    void clear();
    int size();
    boolean isEmpty();

    // Set operations
    boolean addAll(Set<? extends E> set);
    boolean removeAll(Set<? extends E> set);
    boolean retainAll(Set<? extends E> set);
    boolean containsAll(Set<? extends E> set);

    // Convertion
    Object[] toArray();
    <T> T[] toArray(T[] array);

    // Iteration
    Iterator<E> iterator() ;

    // Iterator interface
    interface  Iterator<E> {
        boolean hasNext() ;
        E next() ;
        void remove();
    }

}
