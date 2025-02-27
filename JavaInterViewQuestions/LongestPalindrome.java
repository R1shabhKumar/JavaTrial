// 15. write a java program to find the length of the longest palindrome in a string
public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println("Longest palindrome: "+longestPalindrome(str));
    }

    public static String longestPalindrome(String s){
        int maxLength = 1, start = 0 , len = s.length();
        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
                int flag = 1;

                for(int k=0;k<(j-i+1)/2;k++){
                    if(s.charAt(i+k) != s.charAt(j-k)){
                        flag = 0;
                    
                        if(flag!=0 && (j-k+1)/2 > maxLength){
                            start = i;
                            maxLength = j-i+1;
                        }
                    }
                }
            }
        }
        return s.substring(start, start+maxLength);
    }
}
