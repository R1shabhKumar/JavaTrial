import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretCode {
    public static boolean search(String letter, String code) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int k = code.length();
        for (char c : code.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int charCount = code.length();
        while (j < letter.length()) {
            if (map.containsKey(letter.charAt(j))) {
                if (map.get(letter.charAt(j)) > 0) {
                    charCount--;
                    map.put(letter.charAt(j), map.get(letter.charAt(j)) - 1);
                }
                if (j - i + 1 == k) {
                    if (charCount == 0) return true;
                    if (map.containsKey(letter.charAt(i))) {
                        map.put(letter.charAt(i), map.get(letter.charAt(i)) + 1);
                        charCount++;
                    }
                    i++;
                }
            } else {
                if(j - i + 1 == k){
                    if (charCount == 0) return true;
                    if (map.containsKey(letter.charAt(i))) {
                        map.put(letter.charAt(i), map.get(letter.charAt(i)) + 1);
                        charCount++;
                    }
                    i++;
                }
            }
            j++;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        String letter  = sc.nextLine();
        System.out.println("Enter the code: ");
        String code = sc.nextLine();
        System.out.println(search(letter,code));

    }
}
