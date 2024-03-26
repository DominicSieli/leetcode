class Solution
{
	public String LongestCommonPrefix(String[] strings)
	{
		int i = strings[0].length();

		for(int str = 0; str < strings.length - 1; str++)
		{
			for(int character = 0; character < i; character++)
			{
				if(character >= strings[str].length()) {i = strings[str].length(); break;}
				if(character >= strings[str+1].length()) {i = strings[str+1].length(); break;}
				if(strings[str].charAt(character) != strings[str+1].charAt(character)) i = character;
			}
		}

		return strings[0].substring(0, i);
	}
}

public class LongestCommonPrefix
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
