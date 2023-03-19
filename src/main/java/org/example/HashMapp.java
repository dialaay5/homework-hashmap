package org.example;

import java.util.ArrayList;

public class HashMapp <K, V> {

    ArrayList<K> keys = new ArrayList<>();

    ArrayList<V> values = new ArrayList<>();

    public void put(K key, V value) {
        if (keys.contains(key)) {
            values.set(keys.indexOf(key), value);
            return;
        }
        keys.add(key);
        values.add(value);
    }

    public V get(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            return values.get(index);
        }
        throw new IllegalArgumentException("not exist");
    }
}
