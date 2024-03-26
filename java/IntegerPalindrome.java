class Solution
{
	public boolean IntergerPalindrome(int integer)
	{
		int exponent = 0;
		if(integer < 0) return false;
		if(integer > 0) exponent = (int)Math.log10(integer);

		while(integer != 0)
		{
			if(integer % 10 != (int)(integer / (int)Math.pow(10, exponent))) return false;
			integer = integer % (int)Math.pow(10, exponent);
			integer = (int)(integer / 10);
			exponent -= 2;
		}

		return true;
	}
}

public class IntegerPalindrome
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		System.out.println(solution.IntergerPalindrome(121));
	}
}
