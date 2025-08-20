import java.util.HashMap;
import java.util.Map;

public class Trie {
    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public boolean lookup(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node = node.children.get(ch);
            if (node == null) {
                return false;
            }
        }
        return node.isEndOfWord;
    }

    public boolean update(String oldWord, String newWord) {
        if (lookup(oldWord)) {
            delete(oldWord);
            insert(newWord);
            return true;
        }
        return false;
    }

    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(TrieNode node, String word, int depth) {
        if (depth == word.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return node.children.isEmpty();
        }
        char ch = word.charAt(depth);
        TrieNode childNode = node.children.get(ch);
        if (childNode == null) {
            return false;
        }
        boolean shouldDeleteChild = delete(childNode, word, depth + 1);
        if (shouldDeleteChild) {
            node.children.remove(ch);
            return node.children.isEmpty();
        }
        return false;
    }
}