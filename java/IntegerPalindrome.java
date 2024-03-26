class Solution
{
	public boolean IsIntergerPalindrome(int x)
	{
		int n = 0;
		if(x < 0) return false;
		if(x > 0) n = (int)Math.log10(x);

		while(x != 0)
		{
			if(x % 10 != (int)(x / (int)Math.pow(10, n))) return false;
			x = x % (int)Math.pow(10, n);
			x = (int)(x / 10);
			n -= 2;
		}

		return true;
	}
}

public class Easy_Is_Integer_Palindrome
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		System.out.println(solution.IsIntergerPalindrome(121));
	}
}
