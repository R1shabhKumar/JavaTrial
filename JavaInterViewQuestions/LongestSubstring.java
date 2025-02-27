// 10. write a java program to find the length of the longest substring without repeating characters
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring: "+length);
    }

    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0,left = 0;
        for(int right =0;right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
