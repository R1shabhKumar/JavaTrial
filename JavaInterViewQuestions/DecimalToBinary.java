// 29. write a java program to convert a decimal number to binary
public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary of "+decimal+" is: "+binary);
    }
}
