package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            swappedMap.computeIfPresent(e.getValue(), (k, v) -> v < e.getKey() ? v : e.getKey());
            swappedMap.putIfAbsent(e.getValue(), e.getKey());
        }
        return swappedMap;
    }
}