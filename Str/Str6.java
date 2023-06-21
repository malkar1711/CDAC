package Str;

public class Str6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String str="welcome123";
		
		for(int i=0; i<str.length(); i++)
		{
		  int temp = str.charAt(i);	
		  
		  if((temp >= 65 && temp<= 90 || temp >= 97 && temp <= 122))
		  {
			  count++;
		  }
		  else if((temp>=32 && temp<=47 || temp>=58 && temp<=64 || temp>=91 && temp<=96 || temp>=123 && temp<=126 ))
		  {
			  count++;
		  }
		  else
		  {
			  count++;
		  }
		}
		if(count >=3) {
			System.out.println("all 3 present");
		}
		else if(count >=2)
		{
			System.out.println(" 2 present");
		}
		else
		{
			System.out.println("nothing");
		}
	}

}
