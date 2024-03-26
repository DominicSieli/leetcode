class Solution
{
	public int ReverseInteger(int integer)
	{
		int reverse = 0;
		int lastDigit = 0;

		while(integer != 0)
		{
			lastDigit = integer % 10;
			integer /= 10;

			if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
			if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
			reverse = reverse * 10 + lastDigit;
		}

		return reverse;
	}
}

public class ReverseInteger
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();

		System.out.println(solution.ReverseInteger(123));
		System.out.println(solution.ReverseInteger(-123));
	}
}
