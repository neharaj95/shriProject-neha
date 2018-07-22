package JavaBasics;

import java.util.Scanner;

public class BasicObj {

	public static void main(String[] args) {
		Student array[] = new Student[2];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0 ;i <2;i++){
			//BasicObj st= new BasicObj();
			
			System.out.println("Enter name:");
			String name = sc.next();
			 System.out.println("Enter sir name:");
           String sirname = sc.next();
           
           System.out.println("Enter roll:");
           int roll = sc.nextInt();
           
           System.out.println("Enter marks:");
           int marks = sc.nextInt();
           
           System.out.println("Enter classno:");
           int classno = sc.nextInt();	
           Student abc = new Student(name,sirname,roll,marks,classno);
	       array[i] = abc;
		}
		
		// print
		
		for(int i=0;i<2;i++) {
			System.out.println(array[i].getM_name() +  "   sirname"  +  array[i].getM_sirname());  // abc.get_name()
			 
		    array[i].setM_name("vikas");
		    System.out.println(array[i].getM_name() +  "   sirname"  +  array[i].getM_sirname());  // abc.get_name()
			
		}
	}

	
	//5 store to m int lunga ryt?
		//	5.5 store krna hai to m float lunga ryt?
					
					
		//ab ye batao agra mujhe aesa data store krna hai student ka to m kya lu>
	
	
	// student ka data bahut int aur string ko mila k banta hai ryt?
	// to class na bas ak container hoti hai template jaise 
	
	// ab m jaise int a = 5; int yaha pr ak class hi hai to back m likhi hai java waalo ne

	// int data type hai mjhe apna custome data type bana na hai?
	// mery reuiremnet kya hai aesa data type jo student ki character stics ko store kr skte
	
}








