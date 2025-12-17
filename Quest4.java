import java.util.Scanner;
class Countofnum
{
	public static int[] CountOfMul(int arr[])
	{
		int k=0;
		int res[]=new int[9];
		for(int i=1;i<=9;i++)
		{
			int c=0;
			for(int j:arr)
			{
				if(j%i==0)
					c++;
			}
			res[k++]=c;
		}
		return res;
	}
}
class Quest4
{
	public static void main(String args[])
	{
		int arr[]={1,2,8,9,12,46,76,82,15,20,30};
		int size=arr.length;
		int[]res=Countofnum.CountOfMul(arr);
		System.out.print("{ ");
		for(int i=0;i<9;i++)
		{
		System.out.print((i+1)+" : " +res[i]+" , ");
		}
		System.out.print(" }");
	}
}
/* ======================output=======================
D:\Ahamed\Tandemloop>javac Quest4.java

D:\Ahamed\Tandemloop>java Quest4
{ 1 : 11 , 2 : 8 , 3 : 4 , 4 : 4 , 5 : 3 , 6 : 2 , 7 : 0 , 8 : 1 , 9 : 1 ,  }
D:\Ahamed\Tandemloop>	
*/
		