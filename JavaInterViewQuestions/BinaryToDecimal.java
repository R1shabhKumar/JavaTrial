// 19. write a java program to convert a binary number to decimal
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal of "+binary+" is: "+decimal);
    }
}
