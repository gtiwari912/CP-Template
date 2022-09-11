import java.util.Scanner;
/*
    Printing this box pattern for given boxSize
    ****
    ****
    ****
    ****
 */
public class Pattern1_BOX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boxSize = sc.nextInt();
        for(int i = 1; i<=boxSize; i++){
            for(int j = 1; j<=boxSize; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
