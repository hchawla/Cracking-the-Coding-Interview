import java.util.Scanner;
public class replace
{
	public void replace1(String S1)
	{
		char[] S= S1.toCharArray();
		char[] S2= new char[100];
		int j=0;
		for(int i=0;i < S.length; i++)
		{
			if(S[i]==' ')
			{
				S2[j]='%';
				S2[j+1]='2';
				S2[j+2]='0';
				j=j+3;
			}
			else
			{
				S2[j]=S[i];
				j+=1;
			}
		}
		System.out.println(S);
		System.out.println(S2);
	}
	public static void main(String[] args)
	{
	System.out.println("Enter the String");
	Scanner input = new Scanner(System.in);
	String s= input.nextLine();
	replace r= new replace();
	r.replace1(s);	
	}
}
