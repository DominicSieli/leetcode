class Solution
{
	public boolean Palindrome(String str)
	{
		int left = 0;
		int right = str.length() - 1;

		while(left < right)
		{
			while(left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
			while(left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;
			if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) return false;
			if(left < right) left++;
			if(left < right) right--;
		}

		return true;
	}
}

public class Palindrome
{
	public static void main(String[] args)
	{
		String str = "a #a c -bbc, a:  a ";
		Solution solution = new Solution();
		System.out.println(solution.Palindrome(str));
	}
}
