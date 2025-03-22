import java.util.HashMap;
public class repetative {
    public static void main(String[] args) {
        String inputString = "hemanth";
        printRepetitiveCharacters(inputString);
    }
    public static void printRepetitiveCharacters(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' comes " + entry.getValue() + " times.");
            }
        }
    }
    
}
