import java.util.*;

class Solution
{
	public int[] TwoSum(int[] nums, int target)
	{
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++)
		{
			int complement = target - nums[i];

			if(cache.containsKey(complement))
			{
				return new int[] {cache.get(complement), i};
			}

			if(cache.containsKey(nums[i]) == false) cache.put(nums[i], i);
		}

		return new int[] {0, 0};
	}
}

public class Easy_Two_Sum
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();

		int target = 9;
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
		int[] results = solution.TwoSum(nums, target);

		System.out.println("["+results[0]+"]" + "["+results[1]+"]");
	}
}
