class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.word = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode curr) {
        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == '.') {
                // Try every possible child
                for (TrieNode child : curr.children) {
                    if (child != null && dfs(word, i + 1, child)) {
                        return true;
                    }
                }

                return false;
            }

            int childIndex = c - 'a';

            if (curr.children[childIndex] == null) {
                return false;
            }

            curr = curr.children[childIndex];
        }

        return curr.word;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean word = false;
}