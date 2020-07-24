import java.util.*;
import java.util.stream.Collectors;
public class Letters {
	interface letters
	{
		public List<String> search();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
			letters l=()->{
				System.out.println("Enter the no.of strings to be entered:");
			int n=in.nextInt();
			System.out.println("Strings to be added in List");
			List<String> a=new ArrayList<>();
			for(int i=0;i<n;i++)
				a.add(in.next());
			return a.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	};
	  System.out.println("Strings starting with a(lowercase) and having size 3:"+l.search());
	  in.close();
	}

}