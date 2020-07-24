import java.util.*;
public class PalindromeOrNot {
	interface Palin
	{
		public List<String> pal();
	}
	public static boolean check(String word)
	{
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
		    if (word.charAt(i1) != word.charAt(i2)) {
		        return false;
		    }
		    ++i1;
		    --i2;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Palin p=()->{
		System.out.println("Enter the no.of Strings:");
		int n=in.nextInt();
		List<String> s=new ArrayList<>();
		System.out.println("Enter the strings to be added");
		for(int i=0;i<n;i++)
		{
			s.add(in.next());
		}
		List<String> res=new ArrayList<>();
		for(int i=0;i<s.size();i++)
		{
			String x=s.get(i);
			if(check(x)==true)
				res.add(x);
		}
		return res;
	  };
	  System.out.println("Palindrome strings are:"+p.pal());
	 in.close();
	}

}