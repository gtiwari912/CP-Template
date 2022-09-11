import java.util.Scanner;
/*
    Printing this Right Angle Triangle pattern for given triangle height
    *
    **
    ***
    ****
 */
public class Pattern2_RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int triangleHeight = sc.nextInt();
        for(int i =1; i<=triangleHeight; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
