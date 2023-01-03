package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) {
            return Map.of();
        }
        String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" ");
        Map<String, Integer> wordsToCount = new HashMap<>();
        for (String word : words) {
            wordsToCount.computeIfPresent(word, (k, v) -> v + 1);
            wordsToCount.putIfAbsent(word, 1);
        }
        return wordsToCount;
    }
}