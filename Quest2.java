import java.util.Scanner;
class Logic
{
	public static void seriesOfNo(int a)
	{
		int i=1;
		int x=1;
		if(a>1){
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
class Quest2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a");
		int a=in.nextInt();
		Logic.seriesOfNo(a);
	}
}


/* ==============================Output================


D:\Ahamed\Tandemloop>javac NumSeries.java

D:\Ahamed\Tandemloop>java Numseries
Enter a
0
Output:0
D:\Ahamed\Tandemloop>java Numseries
Enter a
4
Output:1, 3, 5, 7
D:\Ahamed\Tandemloop>java Numseries
Enter a
1
Output:1
D:\Ahamed\Tandemloop>java Numseries
Enter a
2
Output:1, 3
*/

