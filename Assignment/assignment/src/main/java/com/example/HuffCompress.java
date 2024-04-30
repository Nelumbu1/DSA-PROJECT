package com.example;
import java.util.*;
import java.util.Map.Entry;

public class HuffCompress {
	
	private static Map<Character, String> codes = new HashMap<>();
	private static Map<Character, Integer> freq = new HashMap<>();
	private static PriorityQueue<HuffmanNode> minHeap = new PriorityQueue<>();
	

	
	private static void HuffmanCodes(int size) {// Huffman Codes
		for (Entry<Character, Integer> entry : freq.entrySet()) {
			minHeap.add(new HuffmanNode(entry.getKey(), entry.getValue()));
		}
		while (minHeap.size() != 1) {
			HuffmanNode left = minHeap.poll();
			HuffmanNode right = minHeap.poll();
			HuffmanNode top = new HuffmanNode('$', left.freq + right.freq);
			top.left = left;
			top.right = right;
			minHeap.add(top);
		}
		storeCodes(minHeap.peek(), "");
	}
	
	private static void calcFreq(String str) {// Frequency of characters
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
	}
	
	private static void storeCodes(HuffmanNode root, String str) {// Store codes
		if (root == null) {
			return;
		}
		if (root.data != '$') {
			codes.put(root.data, str);
		}
		storeCodes(root.left, str + "0");
		storeCodes(root.right, str + "1");
	}
	
	private static String decodeFile(HuffmanNode root, String s) {// Decode the text file
		String ans = "";
		HuffmanNode curr = root;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
			if (curr.left == null && curr.right == null) {
				ans += curr.data;
				curr = root;
			}
		}
		return ans + '\0';
  }

  public static String compressMessage(String message) {// Compresses the message
		String str = message;
		String encodedString = "";
		String decodedString = "";
		calcFreq(str);
		HuffmanCodes(str.length());
		
		for (char c : str.toCharArray()) {
			encodedString += codes.get(c);
		}
		System.out.println(encodedString);
		decodedString = decodeFile(minHeap.peek(), encodedString);
		
    return decodedString;
	}
	
}

class HuffmanNode implements Comparable<HuffmanNode> {// Node of Huffman Tree
	char data;
	int freq;
	HuffmanNode left, right;
	
	HuffmanNode(char data, int freq) {
		this.data = data;
		this.freq = freq;
	}
	
	public int compareTo(HuffmanNode other) {
		return this.freq - other.freq;
	}
}

