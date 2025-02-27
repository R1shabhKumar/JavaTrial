// 11. write a java program to count the number of vowels in a string

public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = countVowels(str);
        System.out.println("Number of vowels: "+count);
    }

    public static int countVowels(String s){
        int count = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}
