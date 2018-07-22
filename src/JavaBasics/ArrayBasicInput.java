package JavaBasics;

import java.util.Scanner;

public class ArrayBasicInput {
    
	public static void main(String[] args) {
		int res=0;
		int sum[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 values");
		for(int i=0;i<5;i++)
		{
			sum[i]=sc.nextInt();	
		}
        	for(int y=0;y<5;y++) 
        	{
        		res=sum[y]+res;
		}
        	System.out.println("sum of array value :"+ res);
	}
}
