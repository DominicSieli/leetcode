using System;

public class Solution
{
	public int ReverseInteger(int integer)
	{
		int lastDigit = 0;
		int reverse = 0;

		while(integer != 0)
		{
			lastDigit = integer % 10;
			integer /= 10;

			if(reverse > Int32.MaxValue / 10 || (reverse == Int32.MaxValue / 10 && lastDigit > 7)) return 0;
			if(reverse < Int32.MinValue / 10 || (reverse == Int32.MinValue / 10 && lastDigit < -8)) return 0;
			reverse = reverse * 10 + lastDigit;
		}

		return reverse;
	}
}

public class LeetCode
{
	public static void Main()
	{
		Solution solution = new Solution();

		Console.WriteLine(solution.ReverseInteger(123));
		Console.WriteLine(solution.ReverseInteger(-123));
	}
}