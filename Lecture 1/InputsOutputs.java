import java.util.Scanner;  
public class InputsOutputs {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); // creating scanner object so that it can be used to take inputs.

        // taking inputs of different data types using scanner;
        byte age = myScanner.nextByte();
        short salary = myScanner.nextShort();
        int viewsCount = myScanner.nextInt();
        boolean isAbove18 = myScanner.nextBoolean();
        float goldWeight = myScanner.nextFloat();
        double pi = myScanner.nextDouble();
        String name = myScanner.next();
    }
}
