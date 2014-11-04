public class Permutation
{
	public void Permutation(String S1,String S2)
	{
		if(sort(S1).equals(sort(S2)))
		{
			System.out.println("Anagrams");
		}
	}	
	public String sort(String S)
	{
		char[] content= S.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public static void main(String[] args)
	{
		String S1=args[0];
		String S2=args[1];
		Permutation P1 = new Permutation();
		P1.Permutation(S1,S2);
	}
}
