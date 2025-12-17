import java.util.Scanner;
class Calculator
{
	public static double smallCalculator(double a, double b,char ch)
	{
		switch(ch)
		{
			case '+':
				return a+b;
			case '-':
				return a-b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			case '%':
				return a%b;
				
			default:
				System.out.println("give correct operation");
				break;
		}
		return 0;
	}
}
class Quest1
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	while(true)
	{
	System.out.println("+   -> Addition\n" +"-   -> Subtraction\n" +"*   -> Multiplication\n" +"/         -> Division\n" +"%         -> Remainder\n" +"0         -> Exit");
	char ch=in.next().charAt(0);
	if(ch=='0')
	{
		System.out.println("Exit successfully");
	break;
	}
	System.out.println("enter a value");
	double a=in.nextDouble();
	System.out.println("enter b value");
	double b=in.nextDouble();
	double Res=Calculator.smallCalculator(a,b,ch);
	System.out.println("RESULT = "+Res);
	}
}
}
	
/* ======================Output=========================
]D:\Ahamed\Tandemloop>java Quest1
+   -> Addition
-   -> Subtraction
*   -> Multiplication
/         -> Division
%         -> Remainder
0         -> Exit
+
enter a value
10
enter b value
20
RESULT = 30.0
+   -> Addition
-   -> Subtraction
*   -> Multiplication
/         -> Division
%         -> Remainder
0         -> Exit
*
enter a value
20
enter b value
30
RESULT = 600.0
+   -> Addition
-   -> Subtraction
*   -> Multiplication
/         -> Division
%         -> Remainder
0         -> Exit
%
enter a value
100
enter b value
10
RESULT = 0.0
+   -> Addition
-   -> Subtraction
*   -> Multiplication
/         -> Division
%         -> Remainder
0         -> Exit
/
enter a value
100
enter b value
10
RESULT = 10.0
+   -> Addition
-   -> Subtraction
*   -> Multiplication
/         -> Division
%         -> Remainder
0         -> Exit
0
Exit successfully

*/

class