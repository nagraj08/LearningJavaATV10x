import java.util.HashMap;

public class lab_02_CharacterCountReplace {
    public static void main(String[] args) {
        String input = "amit is an automation developer";
        StringBuilder result = new StringBuilder();

        // Step 1: Count occurrences of each character using a HashMap
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Step 2: Replace each character with its count using a for loop
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result.append(charCountMap.get(ch));
        }

        // Print results
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result.toString());
    }
}
