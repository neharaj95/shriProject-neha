package JavaBasics;

import java.util.Scanner;

public class AnimalObjTest {

	public static void main(String[] args) {
		Animal animal[]= new Animal[2];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter species :");
		String species=sc.next();
		System.out.println("Enter height :");
		int height=sc.nextInt();
		System.out.println("Enter weight :");
		int weight=sc.nextInt();
		System.out.println("Enter y or N isFly :");
		String isfly=sc.next();
		System.out.println("Enter type:");
		String type=sc.next();
		
		Animal abc= new Animal(name,species,height,weight,isfly,type);
		animal[i]=abc;
		
		}
		for(int i=0;i<2;i++) {
			
			System.out.println("output :" +animal[i].toStr());
//			System.out.println("output " +animal[i].getM_Species());
//		    System.out.println("output " +animal[i].getM_height());
//		    System.out.println("output " +animal[i].getM_weight());
//		    System.out.println("output " +animal[i].getM_isFly());
//		    System.out.println("output " +animal[i].getM_type());
		}

	}
}


	