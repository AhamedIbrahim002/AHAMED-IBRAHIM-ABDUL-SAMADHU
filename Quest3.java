import java.util.Scanner;
class Logic2
{
	public static void seriesOfNo2(int a)
	{
		int i=1;
		int x=1;
		if(a%2==0)
			a=a-1;
		if(a>=1){
		System.out.print("Output:"+i);
		while(x!=a)
		{
			i=i+2;
			System.out.print(", "+i);
			x++;
		}
	}
	else
		System.out.print("Output:"+a);
	}
	
}
class Quest3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a");
		int a=in.nextInt();
		Logic2.seriesOfNo2(a);
	}
}
