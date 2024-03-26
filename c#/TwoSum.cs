using System;
using System.Collections.Generic;

public class Solution
{
	public int[] TwoSum(int[] array, int target)
	{
		Dictionary<int, int> cache = new Dictionary<int, int>();

		for(int i = 0; i < array.Length; i++)
		{
			int complement = target - array[i];

			if(cache.ContainsKey(complement))
			{
				return new int[] {cache[complement], i};
			}

			if(cache.ContainsKey(array[i]) == false) cache.Add(array[i], i);
		}

		return new int[] {0, 0};
	}
}

public class LeetCode
{
	public static void Main()
	{
		Solution solution = new Solution();

		int target = 9;
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		int[] results = solution.TwoSum(array, target);

		Console.WriteLine("["+results[0]+"]" + "["+results[1]+"]");
	}
}
