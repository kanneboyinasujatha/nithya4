import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char c=sc.next().charAt(0);
		if(c>='A'&&c<='Z'||c>='a'&&c<='z')
		  System.out.print("It is a character");
		else
		  System.out.print("It is not a character");
	}
}
