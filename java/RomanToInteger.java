import java.util.*;

class Solution
{
	public int RomanToInteger(String str)
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

		for(int i = 0; i < str.length(); i++)
		{
			if(i + 1 >= str.length())
			{
				integer += numerals.get(str.charAt(i));
			}

			if(i + 1 < str.length())
			{
				if(numerals.get(str.charAt(i)) >= numerals.get(str.charAt(i + 1))) integer += numerals.get(str.charAt(i));
				if(numerals.get(str.charAt(i)) < numerals.get(str.charAt(i + 1))) {integer += numerals.get(str.charAt(i + 1)) - numerals.get(str.charAt(i)); i++;}
			}
		}

		return integer;
	}
}

public class RomanToInteger
{
	public static void main(String[] args)
	{
		String string1 = "IV";
		String string2 = "IX";
		String string3 = "III";
		String string4 = "LVIII";
		String string5 = "MMCXVI";
		String string6 = "MCMXCIV";
		Solution solution = new Solution();

		System.out.println(solution.RomanToInteger(string1));
		System.out.println(solution.RomanToInteger(string2));
		System.out.println(solution.RomanToInteger(string3));
		System.out.println(solution.RomanToInteger(string4));
		System.out.println(solution.RomanToInteger(string5));
		System.out.println(solution.RomanToInteger(string6));
	}
}
