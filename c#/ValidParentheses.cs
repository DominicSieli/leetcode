using System;
using System.Collections.Generic;

public class Solution
{
	public bool ValidParentheses(String str)
	{
		if(str.Length % 2 != 0) return false;

		Stack<char> stk = new Stack<char>();

		foreach(char character in str)
		{
			if(character == '(' || character == '[' || character == '{') stk.Push(character);

			if(stk.Count == 0)
			{
				if(character == ')' || character == ']' || character == '}') return false;
			}

			if(stk.Count != 0)
			{
				if(character == ')' && stk.Peek() == '(') stk.Pop();
				else if(character == ')' && stk.Peek() != '(') return false;

				if(character == ']' && stk.Peek() == '[') stk.Pop();
				else if(character == ']' && stk.Peek() != '[') return false;

				if(character == '}' && stk.Peek() == '{') stk.Pop();
				else if(character == '}' && stk.Peek() != '{') return false;
			}
		}

		return !Convert.ToBoolean(stk.Count);
	}
}

public class LeetCode
{
	public static void Main()
	{
		String str = "([}}])";
		Solution solution = new Solution();
		Console.WriteLine(solution.ValidParentheses(str));
	}
}