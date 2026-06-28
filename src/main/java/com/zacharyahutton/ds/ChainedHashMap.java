package com.zacharyahutton.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * Separate chaining hash map for integer keys (coursework-friendly, no java.util.HashMap).
 */
public class ChainedHashMap {
    static class Entry {
        int key;
        String value;
        Entry next;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Entry[] buckets;
    private int size;

    public ChainedHashMap(int capacity) {
        buckets = new Entry[Math.max(4, capacity)];
    }

    private int index(int key) {
        return Math.floorMod(key, buckets.length);
    }

    public void put(int key, String value) {
        int idx = index(key);
        Entry cur = buckets[idx];
        while (cur != null) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
            cur = cur.next;
        }
        buckets[idx] = new Entry(key, value, buckets[idx]);
        size++;
    }

    public String get(int key) {
        for (Entry cur = buckets[index(key)]; cur != null; cur = cur.next) {
            if (cur.key == key) return cur.value;
        }
        return null;
    }

    public boolean containsKey(int key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public List<Integer> keys() {
        List<Integer> out = new ArrayList<>();
        for (Entry bucket : buckets) {
            for (Entry cur = bucket; cur != null; cur = cur.next) {
                out.add(cur.key);
            }
        }
        return out;
    }
}
