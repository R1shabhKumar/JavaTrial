// 14. write a java program to count the occurences of each character in a string
import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "rishabh";
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }
        System.out.println("Character count: "+charCount);
    }
}
