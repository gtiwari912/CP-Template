import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Base
{
    
        private static Scanner sc;
        // GCD;
        private static int gcd(int num1, int num2)
        {
          if (num2 == 0)
            return num1;
          return gcd(num2, num1 % num2);
        }
    
        // GCD;
        private static long gcd(long num1, long num2)
        {
          if (num2 == 0)
            return num1;
          return gcd(num2, num1 % num2);
        }
    
        // LCM;
        private static int lcm(int num1, int num2)
        {
            return (num1 / gcd(num1, num2)) * num2;
        }
    
        //Swap
        private static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            solve();
        }
    }

    private static void solve(){
        //Write your code here;
        
    }
    
}