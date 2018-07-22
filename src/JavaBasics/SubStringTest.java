package JavaBasics;

public class SubStringTest {

	public static void main(String[] args) {
		String name = "vikas";
		char[] chars = name.toCharArray();
		String data="sgjasgagsanvikasuhjhkh";
		char[] char2 = data.toCharArray();
		int count=0;
		
		for(int i=0;i<chars.length;i++)
		{
			for(int j=i;j<char2.length;j++) 
			{
				if(chars[i]==char2[j])
				{
					count++;
					System.out.println("y" + count);
					break;
					
				}
				
				
			}
		}

		if(chars.length==count) 
		{
		System.out.println("exist");	
		}
		

	}

}
