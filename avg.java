import java.util.*;
public class Average {
	interface average
	{
		public float avg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		average a=()->{
			System.out.println("Enter the no.of elements:");
			int n=in.nextInt();
			ArrayList<Integer> arr=new ArrayList<Integer>();
			System.out.println("Enter the "+n+"elements:");
			for(int i=0;i<n;i++)
			{
				arr.add(in.nextInt());
			}
			int sum=0;
			for(Integer i:arr)
			{
				sum+=i;
			}
			float AverageOfList=(float)(sum)/arr.size();
			return AverageOfList;
		};
		System.out.println("Average of the list:"+a.avg());
		in.close();
	}

}