using System;

public class Solution
{
	public bool Palindrome(string str)
	{
		int left = 0;
		int right = str.Length - 1;

		while(left < right)
		{
			while(left < right && !Char.IsLetterOrDigit(str[left])) left++;
			while(left < right && !Char.IsLetterOrDigit(str[right])) right--;
			if(Char.ToLower(str[left]) != Char.ToLower(str[right])) return false;
			if(left < right) left++;
			if(left < right) right--;
		}

		return true;
	}
}

public class LeetCode
{
	public static void Main()
	{
		string str = "a #a c -bbc, a:  a ";
		Solution solution = new Solution();
		Console.WriteLine(solution.Palindrome(str));
	}
}