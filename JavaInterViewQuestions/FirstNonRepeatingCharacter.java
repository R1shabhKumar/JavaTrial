// 43. write a java program to find the first non-repeating character in a string
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: "+findFirstNonRepeatingCharacter(str));
    }

    public static Character findFirstNonRepeatingCharacter(String str){
        Map<Character,Integer> charCountMap = new LinkedHashMap<>();

        for(char c: str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
        }

        for(char c: str.toCharArray()){
            if(charCountMap.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
