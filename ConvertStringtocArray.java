import java.util.*;
class ConvertStringtocArray
{
	public static void main(String[] args) 
	{
		 Scanner k=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String name=k.nextLine();

		 char []name1=new char[name.length()];
		 for (int j=0;j<name1.length ;j++ ) 
		 {
		 	name1[j]=name.charAt(j);
		 }
		 System.out.println(Arrays.toString(name1));
	}
}