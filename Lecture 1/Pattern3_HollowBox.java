import java.util.Scanner;
/*
    Printing this box pattern for given boxSize
    ****
    *  *
    *  *
    ****
 */
public class Pattern3_HollowBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boxSize = sc.nextInt();
        for(int i = 1; i<=boxSize; i++){
            for(int j = 1; j<=boxSize; j++){
                if(i==1 || i==boxSize || j==1 || j==boxSize){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
