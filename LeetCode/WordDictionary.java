package com.example.com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    // Initialize your data structure here.
    private Map<Character, TrieNode> children;
    private boolean isWord;

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
    }
    
    TrieNode addLetter(Character letter) {
        if (!children.containsKey(letter)) {
            children.put(letter, new TrieNode());
        }
        return children.get(letter);
    }
    
    TrieNode getChild(Character letter) {
        return children.get(letter);
    }
    
    void setIsWord() {
        isWord = true;
    }
    
    boolean isWord() {
        return isWord;
    }
    
    List<TrieNode> getAllChildren() {
        return new ArrayList<TrieNode>(children.values());
    }
}



public class WordDictionary {

	    private static TrieNode root = new TrieNode();
	    
//	    public WordDictionary() {
//	        this.root = new TrieNode();
//	    }

	    // Adds a word into the data structure.
	    public static void addWord(String word) {
	        TrieNode currentNode = root;
	        for (int i = 0; i < word.length(); i++) {
	            currentNode = currentNode.addLetter(word.charAt(i));
	        }
	        currentNode.setIsWord();
	    }

	    // Returns if the word is in the data structure. A word could
	    // contain the dot character '.' to represent any one letter.
	    public static boolean search(String word) {
	        return search(word, 0, root);
	    }
	    
	    private static boolean search(String word, int index, TrieNode node) {
	        if (index == word.length()) {
	            return node.isWord();
	        }
	        if ('.' == word.charAt(index)) {
	            for (TrieNode child : node.getAllChildren()) {
	                if (search(word, index + 1, child)) {
	                    return true;
	                }
	            }
	        } else {
	            TrieNode child = node.getChild(word.charAt(index));
	            if (child != null) {
	                return search(word, index + 1, child);
	            }
	        }
	        return false;
	    }
	
	
	public static void main(String[] args) {
		addWord("Hello");
		addWord("Amey");
		addWord("Jain");
		System.out.println(search("Amey"));
	}

}
