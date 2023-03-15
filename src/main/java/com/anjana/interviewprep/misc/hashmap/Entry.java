package com.anjana.interviewprep.misc.hashmap;

public class Entry<K,V>{
    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
