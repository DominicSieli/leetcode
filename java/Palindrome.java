class Solution
{
	public boolean IsPalindrome(String s)
	{
		int l = 0;
		int r = s.length() - 1;

		while(l < r)
		{
			while(l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
			while(l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
			if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
			if(l < r) l++;
			if(l < r) r--;
		}

		return true;
	}
}

public class Easy_Is_Palindrome
{
	public static void main(String[] args)
	{
		String s = "a #a c -bbc, a:  a ";
		Solution solution = new Solution();
		System.out.println(solution.IsPalindrome(s));
	}
}
