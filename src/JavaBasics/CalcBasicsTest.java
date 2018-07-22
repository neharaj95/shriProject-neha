package JavaBasics;

import java.util.Scanner;

public class CalcBasicsTest {
	//bety ji sikhna to padega hi na ye batao aapke according thode sab chalenge bety ji
	// isko sikhte hai okay
	
	
	
	//mistake
	
	
	// 1.  dont make static variables without when it must  => bank ka intrest rate jo sab object k liye equal hona chhaiye
	//  2. 

	public static void main(String[] args) {
		 int firstVal;
		 int secVal;
		 
		Scanner obj= new Scanner(System.in);
		System.out.println("Please enter firstval");
		firstVal=obj.nextInt();
		System.out.println("Please enter secVal");
		secVal=obj.nextInt();
		CalcBasicsTest obj1= new CalcBasicsTest();
		System.out.println("Please enter 1 for addtion \n 2 for sub\n  3 for mult\n 4 for div\n");
        int val=obj.nextInt();
        int res=0;
        if(val==1) {
        	res= obj1.add(firstVal,secVal);
        }
        else if (val==2) {
        	res=obj1.sub(firstVal,secVal);
        }
        else if (val==3) {
        	res=obj1.mult(firstVal,secVal);
        }
        else if (val==4) {
		res=obj1.div(firstVal,secVal);
			
	}
        System.out.println("result is "+ res);
}
		// always hum function utility jaise banate hai jitta independ ho utta acha 
		public int add(int firstVal,int secVal) {
		 return firstVal+secVal;
			
		}
		public int sub(int firstVal,int secVal) {
			return firstVal-secVal;
				
		}
		public int mult(int firstVal,int secVal) {
			return firstVal*secVal;
			
		}
		public int div(int firstVal,int secVal) {
			return firstVal/secVal;
			
		}
		
		

	

}
