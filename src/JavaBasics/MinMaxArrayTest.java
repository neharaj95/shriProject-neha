package JavaBasics;

public class MinMaxArrayTest {
   
	public static void main(String[] args) {
		int sum[]= new int[10];
		sum[0]=15;
		sum[1]=16;
		sum[2]=17;
		sum[3]=17;
		sum[4]=11;
		sum[5]=12;
		sum[6]=1;
		sum[7]=8;
		sum[8]=108;
		sum[9]=18;
		
		int max=Integer.MAX_VALUE;
		for(int i=0;i<10;i++) 
		{
			if(sum[i]<max) 
			{
				 max= sum[i];
				 
			}
			
			
		}
		System.out.println("min value is "+ max);
	}

}
