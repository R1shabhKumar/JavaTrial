// 45. write a java program to reverse the words in a sentence
public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World From Java";
        String reversed = reverseWords(sentence);
        System.out.println("Reversed sentence: "+reversed);
    }

    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length-1;i>=0;i--){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
