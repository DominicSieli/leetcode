using System;

class Solution
{
	public static int RemoveDuplicates(int[] array)
	{
		int c = 0;
		int k = array.Length;

		for(int i = 0; i < array.Length; i++)
		{
			if(i != c && array[i] == array[c]) k--;

			if(array[i] > array[c])
			{
				c++;
				array[c] = array[i];
			}
		}

		return k;
	}
}

public class LeetCode
{
	public static void Main()
	{
		int[] array = {1,1,1,1,2,2,2,2,3,3};

		int k = Solution.RemoveDuplicates(array);

		for(int i = 0; i < k; i++)
		{
			Console.WriteLine("{0}", array[i]);
		}
	}
}
