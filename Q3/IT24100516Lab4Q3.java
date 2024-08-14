import java.util.Scanner;
public class IT24100516Lab4Q3
{
	public static void main(String[]args)
	{
	String result;
	int num;

	Scanner input=new Scanner(System.in);
	System.out.print("Enter a number: ");
	num=input.nextInt();

	result=(num>0)? "The number is positive.":
	              (num<0)? "The number is negative.":
                                "The number is zero.";
	System.out.println(result);
	}
}