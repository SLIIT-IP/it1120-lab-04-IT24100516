import java.util.Scanner;
public class IT24100516Lab4Q2
{
	public static void main(String[]args)
	{
	double examMarks,labMarks,examPercentage,labPercentage,finalMarks;

	Scanner input=new Scanner(System.in);

	System.out.print("Enter exam marks(out of 100): ");
	examMarks=input.nextDouble();

	if(examMarks<0 || examMarks>100)
	{
	System.out.print(" Invalid input for exam mark. Terminating the program.");
	}

	System.out.print("Enter lab submission marks(out of 100): ");
	labMarks=input.nextDouble();

	if(labMarks<0 || labMarks>100)
	{
	System.out.print(" Invalid input for lab submission mark. Terminating the program.");
	}

	System.out.print("Enter the percentage taken from the exam : ");
	examPercentage=input.nextDouble();

	System.out.print("Enter the percentage taken from the lab submission: ");
	labPercentage=input.nextDouble();

	if(examPercentage+labPercentage!=100)
	{
	System.out.print(" The percentage must add upto 100. Terminating the program.");
	}

	finalMarks=(examMarks*examPercentage/100) + (labMarks*labPercentage/100);

        System.out.print("Final mark is : " + finalMarks);
	}
}