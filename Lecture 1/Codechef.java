// Problem Name: FEVER
// Problem Link: https://www.codechef.com/problems/FEVER
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int testNo = 1; testNo <= t; testNo++){
		    int temp = sc.nextInt();
		    if(temp>98){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
