package JavaBasics;

public class SortArrayTest {

	public static void main(String[] args) {
		int sum[]= new int[10];
		sum[0]=15;
		sum[1]=16;
		sum[2]=10;
		sum[3]=17;
		sum[4]=11;
		sum[5]=12;
		sum[6]=1;
		sum[7]=8;
		sum[8]=17;
		sum[9]=108;
		int temp;
		for(int i=0;i<10;i++) 
		{
			for(int j=0;j<10;j++)
			{
			if(sum[i]<sum[j]) 
			{
				temp=sum[i];
				sum[i]=sum[j];
				sum[j]=temp;		
			}
		    }
	   }
	for(int y=0;y<10;y++) {
		System.out.println(sum[y]);
	}
		
			
		}
		
	}


