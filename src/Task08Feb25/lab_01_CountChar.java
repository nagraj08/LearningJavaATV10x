package Task08Feb25;

import java.util.HashMap;

public class lab_01_CountChar {
    public static void main(String[] args) {
        String input = "amit is an automation developer";
        StringBuilder result = new StringBuilder();

        // Step 1: Count occurrences of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Replace each character with its count
        for (char ch : input.toCharArray()) {
            result.append(charCountMap.get(ch));
        }

        // Print results
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result.toString());
    }
}
