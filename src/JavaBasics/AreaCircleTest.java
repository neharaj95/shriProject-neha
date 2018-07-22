package JavaBasics;

import java.util.Scanner;

public class AreaCircleTest {
	
	static double pi = 3.14;
	

	public static void main(String[] args) {
		int r;
		double area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of r ");
		r=sc.nextInt();
		AreaCircleTest objt= new AreaCircleTest();
		//callin time bas value paas krte hai wo bhi value ka type wo hi hona chahiye jo function defination m diya hai 
		
		area=objt.area(r);
		System.out.println("area is :"+ area);

	}
	public double area(int r) {
		return pi*r*r;
		
	}

}
