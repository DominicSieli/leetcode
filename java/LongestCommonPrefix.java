class Solution
{
	public String LongestCommonPrefix(String[] strings)
	{
		int i = strings[0].length();

		for(int s = 0; s < strings.length - 1; s++)
		{
			for(int c = 0; c < i; c++)
			{
				if(c >= strings[s].length()) {i = strings[s].length(); break;}
				if(c >= strings[s+1].length()) {i = strings[s+1].length(); break;}
				if(strings[s].charAt(c) != strings[s+1].charAt(c)) i = c;
			}
		}

		return strings[0].substring(0, i);
	}
}

public class Easy_Longest_Common_Prefix
{
	public static void main(String[] args)
	{
		String[] string1 = new String[] {"a"};
		String[] string2 = new String[] {"",""};
		String[] string3 = new String[] {"ab","a"};
		String[] string4 = new String[] {"flower","flow","flight"};

		Solution solution = new Solution();
		System.out.println(solution.LongestCommonPrefix(string1));
		System.out.println(solution.LongestCommonPrefix(string2));
		System.out.println(solution.LongestCommonPrefix(string3));
		System.out.println(solution.LongestCommonPrefix(string4));
	}
}
