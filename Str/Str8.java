package Str;

public class Str8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pranav";
		
		for(int i=0;i<str.length(); i++) 
		{
			char temp=str.charAt(i);
			int count = 0;
			
			for(int j=0;j<str.length();j++)
			{
				if(temp == str.charAt(j)) {
					count++;
					
				}
			}
			System.out.println(count);
		}
		
		

	}

}
