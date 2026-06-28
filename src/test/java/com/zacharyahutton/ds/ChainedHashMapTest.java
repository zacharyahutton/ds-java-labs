package com.zacharyahutton.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainedHashMapTest {
    @Test
    void putGetAndOverwrite() {
        ChainedHashMap map = new ChainedHashMap(8);
        map.put(1, "one");
        map.put(2, "two");
        assertEquals("one", map.get(1));
        map.put(1, "ONE");
        assertEquals("ONE", map.get(1));
        assertEquals(2, map.size());
    }
}
