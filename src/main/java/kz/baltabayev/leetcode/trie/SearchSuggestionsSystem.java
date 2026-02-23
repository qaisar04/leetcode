package kz.baltabayev.leetcode.trie;

import java.util.ArrayList;
import java.util.List;

public class SearchSuggestionsSystem {

    public static class Trie {

        private final Node root;

        private static class Node {

            private final Node[] children = new Node[26];
            private final List<String> words = new ArrayList<>();;

            public Node() {
            }
        }

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node current = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new Node();
                }
                current = current.children[index];
                current.words.add(word);
            }
        }

        public List<String> search(String word) {
            Node current = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    return new ArrayList<>();
                }
                current = current.children[index];
            }
            return current.words;
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();

        for (String product : products) {
            trie.insert(product);
        }

        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> searched = trie.search(searchWord.substring(0, i + 1));
            if (!searched.isEmpty()) {
                result.add(searched.stream().sorted().limit(3).toList());
            } else {
                result.add(searched);
            }
        }

        return result;
    }
}
