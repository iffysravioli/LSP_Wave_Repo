package org.howard.edu.lsp.assignment2;
import java.io.*;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	    public static void main(String[] args) {
	  
	        String filename = "src/org/howard/edu/lsp/assignment2/words.txt";
	        Map<String, Integer> wordCounts = new HashMap<>();
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
	            String line;
	            
	            while ((line = br.readLine()) != null) {
	              
	                String[] words = line.split("[^a-zA-Z]");
	                
	                for (String word : words) {
	                    word = word.toLowerCase();
	                    
	                    
	                    if (word.length() > 3) {
	                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        
	        wordCounts.forEach((word, count) -> System.out.println(word + "\t" + count));
	    }
	}
