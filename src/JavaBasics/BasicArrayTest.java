package JavaBasics;

public class BasicArrayTest {
      
	public static void main(String[] args) {
		int res=0;
		int sum[]= new int[5];
		sum[0]=15;
		sum[1]=16;
		sum[2]=17;
		sum[3]=17;
		sum[4]=18;
		for(int i=0;i<5;i++) 
		{	
		  res=sum[i]+res;	
		}
		System.out.println("sum of array ="+res);
	}

}
