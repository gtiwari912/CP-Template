/*
    कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।
    मा कर्मफलहेतु र्भूर्मा ते संगोस्त्वकर्मणि ।।
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Base {

  static class FastScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens())
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    int[] readArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }
      
    int[][] readMatrix(int n, int m){
        int[][] mat = new int[n][m];
        for(int i = 0; i<n; i++)
            for(int j = 0; j<m; j++)
                mat[i][j] = nextInt();
        return mat;
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    float nextFloat() {
      return Float.parseFloat(next());
    }
  }

  private static StringBuilder finalAns;

  // GCD;
  private static int gcd(int num1, int num2) {
    if (num2 == 0)
      return num1;
    return gcd(num2, num1 % num2);
  }

  // GCD;
  private static long gcd(long num1, long num2) {
    if (num2 == 0)
      return num1;
    return gcd(num2, num1 % num2);
  }

  // LCM;
  private static int lcm(int num1, int num2) {
    return (num1 / gcd(num1, num2)) * num2;
  }

  // Swap
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // REVERSING ARRAY;
  private void reverse(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  private void reverse(long[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      long temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  private void reverse(char[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }

  private static FastScanner sc;

  // MAIN METHOD;
  public static void main(String[] args) {
    sc = new FastScanner();
    finalAns = new StringBuilder();
    int test = sc.nextInt();
    while (test-- > 0) {
      solve();
    }
    System.out.println(finalAns);
  }

  private static void solve() {
    // Write your code here;

  }

}
