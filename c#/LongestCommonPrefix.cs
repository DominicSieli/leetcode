using System;

public class Solution
{
	public String LongestCommonPrefix(String[] strings)
	{
		int i = strings[0].Length;

		for(int str = 0; str < strings.Length - 1; str++)
		{
			for(int character = 0; character < i; character++)
			{
				if(character >= strings[str].Length) {i = strings[str].Length; break;}
				if(character >= strings[str+1].Length) {i = strings[str+1].Length; break;}
				if(strings[str][character] != strings[str+1][character]) i = character;
			}
		}

		return strings[0].Substring(0, i);
	}
}

public class LeetCode
{
	public static void Main()
	{
		String[] string1 = new string[] {"a"};
		String[] string2 = new string[] {"",""};
		String[] string3 = new string[] {"ab","a"};
		String[] string4 = new string[] {"flower","flow","flight"};

		Solution solution = new Solution();
		Console.WriteLine(solution.LongestCommonPrefix(string1));
		Console.WriteLine(solution.LongestCommonPrefix(string2));
		Console.WriteLine(solution.LongestCommonPrefix(string3));
		Console.WriteLine(solution.LongestCommonPrefix(string4));
	}
}