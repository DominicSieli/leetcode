import java.util.*;

class Solution
{
	public int RomanToInteger(String s)
	{
		int integer = 0;
		Map<Character, Integer> numerals = new HashMap<Character, Integer>();

		numerals.put('I', 1);
		numerals.put('V', 5);
		numerals.put('X', 10);
		numerals.put('L', 50);
		numerals.put('C', 100);
		numerals.put('D', 500);
		numerals.put('M', 1000);

	    for(int i = 0; i < s.length(); i++)
		{
			if(i + 1 >= s.length())
			{
				integer += numerals.get(s.charAt(i));
			}

			if(i + 1 < s.length())
			{
				if(numerals.get(s.charAt(i)) >= numerals.get(s.charAt(i + 1))) integer += numerals.get(s.charAt(i));
				if(numerals.get(s.charAt(i)) < numerals.get(s.charAt(i + 1))) {integer += numerals.get(s.charAt(i + 1)) - numerals.get(s.charAt(i)); i++;}
			}
		}

		return integer;
	}
}

public class Easy_Roman_To_Integer
{
	public static void main(String[] args)
	{
		String s1 = "IV";
		String s2 = "IX";
		String s3 = "III";
		String s4 = "LVIII";
		String s5 = "MMCXVI";
		String s6 = "MCMXCIV";
		Solution solution = new Solution();

		System.out.println(solution.RomanToInteger(s1));
		System.out.println(solution.RomanToInteger(s2));
		System.out.println(solution.RomanToInteger(s3));
		System.out.println(solution.RomanToInteger(s4));
		System.out.println(solution.RomanToInteger(s5));
		System.out.println(solution.RomanToInteger(s6));
	}
}
