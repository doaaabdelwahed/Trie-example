package com.example.trie;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trie")
public class TrieController {
    private final Trie trie = new Trie();

    @PostMapping("/insert")
    public String insert(@RequestParam String word) {
        trie.insert(word);
        return "Inserted: " + word;
    }

    @GetMapping("/lookup")
    public boolean lookup(@RequestParam String word) {
        return trie.lookup(word);
    }

    @PutMapping("/update")
    public String update(@RequestParam String oldWord, @RequestParam String newWord) {
        boolean updated = trie.update(oldWord, newWord);
        return updated ? "Updated: " + oldWord + " to " + newWord : "Update failed";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam String word) {
        boolean deleted = trie.delete(word);
        return deleted ? "Deleted: " + word : "Delete failed";
    }
}
