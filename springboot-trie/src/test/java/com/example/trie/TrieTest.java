import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrieTest {
    private Trie trie;

    @BeforeEach
    public void setUp() {
        trie = new Trie();
    }

    @Test
    public void testInsertAndLookup() {
        trie.insert("hello");
        assertTrue(trie.lookup("hello"));
        assertFalse(trie.lookup("hell"));
        assertFalse(trie.lookup("world"));
    }

    @Test
    public void testUpdate() {
        trie.insert("hello");
        assertTrue(trie.update("hello", "world"));
        assertFalse(trie.lookup("hello"));
        assertTrue(trie.lookup("world"));
    }

    @Test
    public void testDelete() {
        trie.insert("hello");
        trie.delete("hello");
        assertFalse(trie.lookup("hello"));
    }
}