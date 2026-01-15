package com.structures;


/*
    The Map interface is a part of the Java Collections Framework and is used to store key-value pairs.
    Each key must be unique, but values can be duplicated.
    A Map is useful when you want to associate a key (like a name or ID) with a value (like an age or description).

    Common classes that implement Map:

    HashMap - fast and unordered
    TreeMap - sorted by key
    LinkedHashMap - ordered by insertion

    Tip: Use a Map when you want to associate values with unique keys, like storing user IDs with names.

    Common Map Methods:
    Method	        Description
    put()	        Adds or updates a key-value pair
    get()	        Returns the value for a given key
    remove()	    Removes the key and its value
    containsKey()	Checks if the map contains the key
    keySet()	    Returns a set of all keys
 */

import java.util.Collection;

/**
 * An object that maps keys to values. A map cannot contain duplicate keys;
 * each key can map to at most one value.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface Map<K, V> {

    // ========== Query Operations ==========

    /**
     * Returns the number of key-value mappings in this map.
     * @return the number of key-value mappings in this map
     */
    int size();

    /**
     * Returns true if this map contains no key-value mappings.
     * @return true if this map contains no key-value mappings
     */
    boolean isEmpty();

    /**
     * Returns true if this map contains a mapping for the specified key.
     * @param key key whose presence in this map is to be tested
     * @return true if this map contains a mapping for the specified key
     * @throws ClassCastException if the key is of an incompatible type
     * @throws NullPointerException if the specified key is null and this map does not permit null keys
     */
    boolean containsKey(Object key);

    /**
     * Returns true if this map maps one or more keys to the specified value.
     * @param value value whose presence in this map is to be tested
     * @return true if this map maps one or more keys to the specified value
     * @throws ClassCastException if the value is of an incompatible type
     * @throws NullPointerException if the specified value is null and this map does not permit null values
     */
    boolean containsValue(Object value);

    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     * A return value of null does NOT necessarily indicate the map contains no mapping for the key; it's also possible that the map explicitly maps the key to null. Use {@link #containsKey} to distinguish these cases.
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if this map contains no mapping for the key
     * @throws ClassCastException if the key is of an incompatible type
     * @throws NullPointerException if the specified key is null and this map does not permit null keys
     */
    V get(Object key);

    // ========== Modification Operations ==========

    /**
     * Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced by the specified value.
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with key, or null if there was no mapping for key.
     * @throws UnsupportedOperationException if the put operation is not supported by this map
     * @throws ClassCastException if the class of the specified key or value prevents it from being stored in this map
     * @throws NullPointerException if the specified key or value is null and this map does not permit null keys or values
     * @throws IllegalArgumentException if some property of the specified key or value prevents it from being stored in this map
     */
    V put(K key, V value);

    /**
     * Removes the mapping for a key from this map if it is present.
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with key, or null if there was no mapping for key.
     * @throws UnsupportedOperationException if the remove operation is not supported by this map
     * @throws ClassCastException if the key is of an incompatible type
     * @throws NullPointerException if the specified key is null and this map does not permit null keys
     */
    V remove(Object key);

    // ========== Bulk Operations ==========

    /**
     * Copies all of the mappings from the specified map to this map. The effect of this call is equivalent to calling put(k, v) on this map once for each mapping from key k to value v in the specified map.
     * @param m mappings to be stored in this map
     * @throws UnsupportedOperationException if the putAll operation is not supported by this map
     * @throws ClassCastException if the class of a key or value in the specified map prevents it from being stored in this map
     * @throws NullPointerException if the specified map is null, or if this map does not permit null keys or values and the specified map contains null keys or values
     * @throws IllegalArgumentException if some property of a key or value in the specified map prevents it from being stored in this map
     */
    void putAll(Map<? extends K, ? extends V> m);

    /**
     * Removes all of the mappings from this map. The map will be empty after this call returns.
     * @throws UnsupportedOperationException if the clear operation is not supported by this map
     */
    void clear();

    // ========== View Operations ==========

    /**
     * Returns a {@link Set} view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. If the map is modified while an iteration over the set is in progress, the results of the iteration are undefined.
     * @return a set view of the keys contained in this map
     */
    Set<K> keySet();

    /**
     * Returns a {@link Collection} view of the values contained in this map. The collection is backed by the map, so changes to the map are reflected in the collection, and vice-versa. If the map is modified while an iteration over the collection is in progress, the results of the iteration are undefined.
     * @return a collection view of the values contained in this map
     */
    Collection<V> values();

    /**
     * Returns a {@link Set} view of the mappings contained in this map. Each element in the returned set is a {@link Map.Entry}. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. If the map is modified while an iteration over the set is in progress, the results of the iteration are undefined.
     * @return a set view of the mappings contained in this map
     */
    Set<Map.Entry<K, V>> entrySet();

    // ========== Nested Interface: Map.Entry ==========

    /**
     * A map entry (key-value pair). The Map.entrySet method returns a collection-view of the map, whose elements are of this class. The only way to obtain a reference to a map entry is from the iterator of this collection-view.
     */
    interface Entry<K, V> {

        /**
         * Returns the key corresponding to this entry.
         * @return the key corresponding to this entry
         */
        K getKey();

        /**
         * Returns the value corresponding to this entry.
         * @return the value corresponding to this entry
         */
        V getValue();

        /**
         * Replaces the value corresponding to this entry with the specified value. The behavior of this call is undefined if the mapping has already been removed from the map.
         * @param value new value to be stored in this entry
         * @return the old value corresponding to the entry
         * @throws UnsupportedOperationException if the put operation is not supported by the backing map
         * @throws ClassCastException if the class of the specified value prevents it from being stored in the backing map
         * @throws NullPointerException if the backing map does not permit null values and the specified value is null
         * @throws IllegalArgumentException if some property of the specified value prevents it from being stored in the backing map
         */
        V setValue(V value);

        /**
         * Compares the specified object with this entry for equality. Returns true if the given object is also a map entry and the two entries represent the same mapping.
         */
        boolean equals(Object o);

        /**
         * Returns the hash code value for this map entry.
         */
        int hashCode();
    }

    // ========== Comparison and Hashing ==========

    /**
     * Compares the specified object with this map for equality.
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this map.
     */
    int hashCode();
}