import java.util.*;
import java.io.*;

public class Solver {

public static void main(String [] args) throws Exception
{
	/*
	 * for the next line when compiling make sure to put the whole path of where the file is located.
	 */
	Scanner scan = new Scanner(new File("/Users/jaysonnegron/Documents/workspace/Alien/src/A-small-practice.in"));	
	int n = scan.nextInt();
	StringBuilder build = new StringBuilder();
	for (int i = 1; i <= n; i++)
	{		
		build.delete(0, build.length());
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		int sum1 = s1.length(), sum2 = s2.length(), sum3 = s3.length();
		int num = 0;
		for (int k = 0; k < sum1; k++)
		{
			char ch = s1.charAt(k);
			for (int j = 0; j < sum2; j++)
			{
				if (ch == s2.charAt(j))
				{
					num *= sum2;
					num +=j;
					break;
				}
			}
		}
		if (num == 0)
			build.append(s3.charAt(0));
		while (num > 0)
		{			
			build.append(s3.charAt(num%sum3));	
			num /= sum3;
		}
		build.reverse();
		System.out.println("Case #"+i+": "+build.toString());
	}
	
}
	
	
}