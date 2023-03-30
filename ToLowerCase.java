import java.util.*;
class ToLowerCase
{
	public static void main(String[] args) 
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter String Literal:");
		String ip=k.nextLine();
		toLowerCase(ip);
	}
	public static void toLowerCase(String ip)
	{
		char [] name=new char[ip.length()];
		for (int i=0;i<name.length ;i++ ) 
		{
		    name[i]=ip.charAt(i);	
		}
		//System.out.println(Arrays.toString(name));
        
        String lower="";
		for (int j=0,temp;j<name.length ;j++ ) 
		{
			if (name[j]>=65 && name[j]<=90) 
			{
			    temp=name[j]+32;
			    lower+=(char)temp;
			} 
			else 
			{
                lower+=name[j];
			}
		}
		System.out.println(lower);
		
		System.out.println("Hii From To Lowercase");
		Sytem.out.println("this file is updated in github");
	}
}
