package JavaBasics;

import java.util.Scanner;

public class SearchArrayTest {

	public static void main(String[] args) {
		int flag=0;
		int search[]= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 10 values:");
		for(int i=0;i<10;i++) {
			search[i]=sc.nextInt();
		}
		System.out.println("Enter number which u want to search:");
		int num= sc.nextInt();
		for(int i=0;i<10;i++) 
		{
        if(search[i]==num)
        {
        	  System.out.println("number found :" +search[i]);
        	 
        } 
       
    }
		
	
  }
}
