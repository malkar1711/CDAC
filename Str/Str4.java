package Str;

public class Str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pranav";
		int v=0 ,c=0;
		for(int i=0; i<str.length(); i++)
		{
			char temp=str.charAt(i);
			if(temp=='a'|| temp=='e' || temp=='i' || temp=='o' || temp=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
			
					
		}
		System.out.println(v);
		System.out.println(c);

	}

}
