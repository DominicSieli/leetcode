using System;
using System.Collections.Generic;

public class Solution
{
	public int RomanToInteger(string str)
	{
		int integer = 0;
		Dictionary<char, int> numerals = new Dictionary<char, int>();

		numerals.Add('I', 1);
		numerals.Add('V', 5);
		numerals.Add('X', 10);
		numerals.Add('L', 50);
		numerals.Add('C', 100);
		numerals.Add('D', 500);
		numerals.Add('M', 1000);

		for(int i = 0; i < str.Length; i++)
		{
			if(i + 1 >= str.Length)
			{
				integer += numerals[str[i]];
			}

			if(i + 1 < str.Length)
			{
				if(numerals[str[i]] >= numerals[str[i + 1]]) integer += numerals[str[i]];
				if(numerals[str[i]] < numerals[str[i + 1]]) {integer += numerals[str[i + 1]] - numerals[str[i]]; i++;}
			}
		}

		return integer;
	}
}

public class LeetCode
{
	public static void Main()
	{
		string string1 = "IV";
		string string2 = "IX";
		string string3 = "III";
		string string4 = "LVIII";
		string string5 = "MMCXVI";
		string string6 = "MCMXCIV";
		Solution solution = new Solution();

		Console.WriteLine(solution.RomanToInteger(string1));
		Console.WriteLine(solution.RomanToInteger(string2));
		Console.WriteLine(solution.RomanToInteger(string3));
		Console.WriteLine(solution.RomanToInteger(string4));
		Console.WriteLine(solution.RomanToInteger(string5));
		Console.WriteLine(solution.RomanToInteger(string6));
	}
}