import java.util.*;

class Solution
{
	public int[] TwoSum(int[] array, int target)
	{
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

		for(int i = 0; i < array.length; i++)
		{
			int complement = target - array[i];

			if(cache.containsKey(complement))
			{
				return new int[] {cache.get(complement), i};
			}

			if(cache.containsKey(array[i]) == false) cache.put(array[i], i);
		}

		return new int[] {0, 0};
	}
}

public class TwoSum
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();

		int target = 9;
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		int[] results = solution.TwoSum(array, target);

		System.out.println("["+results[0]+"]" + "["+results[1]+"]");
	}
}
