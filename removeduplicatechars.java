class removeduplicatecharsFromString
{
	public static void main(String[] args)
    {
        char s[] = "goodevening".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }
     public static void removeDuplicates(char s[], int n)
    {
        String ans="";
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(s[i]==s[j])
                {
                    break;     
                }              
                               
            }
            if(j==i)
            {                  
                ans+=s[i];     
            }                 
        }
        System.out.print(ans);
    }
    

}