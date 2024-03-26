class Solution
{
	public int ReverseInteger(int x)
	{
		int xlast = 0;
		int reverse = 0;

		while(x != 0)
		{
			xlast = x % 10;
			x /= 10;

			if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && xlast > 7)) return 0;
			if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && xlast < -8)) return 0;
			reverse = reverse * 10 + xlast;
		}

		return reverse;
	}
}

public class Easy_Reverse_Integer
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();

		System.out.println(solution.ReverseInteger(123));
		System.out.println(solution.ReverseInteger(-123));
	}
}
