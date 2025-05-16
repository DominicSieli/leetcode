using System;

public class Solution
{
	public bool IntergerPalindrome(int integer)
	{
		int exponent = 0;
		if(integer < 0) return false;
		if(integer > 0) exponent = (int)Math.Log10(integer);

		while(integer != 0)
		{
			if(integer % 10 != (int)(integer / (int)Math.Pow(10, exponent))) return false;
			integer = integer % (int)Math.Pow(10, exponent);
			integer = (int)(integer / 10);
			exponent -= 2;
		}

		return true;
	}
}

public class LeetCode
{
	public static void Main()
	{
		Solution solution = new Solution();
		Console.WriteLine(solution.IntergerPalindrome(121));
	}
}