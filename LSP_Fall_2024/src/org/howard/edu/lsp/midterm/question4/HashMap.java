package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class HelloWorld {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        int count = 0; for (String key : map1.keySet()) if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) count++;
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>(), map2 = new HashMap<>();
        map1.put("Alice", "Healthy"); map1.put("Mary", "Ecstatic"); map1.put("Bob", "Happy");
        map2.put("Mary", "Ecstatic"); map2.put("Bob", "Happy"); map2.put("Felix", "Healthy");
        System.out.println("Common pairs: " + commonKeyValuePairs(map1, map2)); // Output: 2
    }
}
