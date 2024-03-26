import java.util.*;

class Solution
{
	public boolean ValidParentheses(String s)
	{
		if(s.length() % 2 != 0) return false;

		Stack<Character> stk = new Stack<Character>();

		for(char c : s.toCharArray())
		{
			if(c == '(' || c == '[' || c == '{') stk.push(c);

			if(stk.size() == 0)
			{
				if(c == ')' || c == ']' || c == '}') return false;
			}

			if(stk.size() != 0)
			{
				if(c == ')' && stk.peek() == '(') stk.pop();
				else if(c == ')' && stk.peek() != '(') return false;

				if(c == ']' && stk.peek() == '[') stk.pop();
				else if(c == ']' && stk.peek() != '[') return false;

				if(c == '}' && stk.peek() == '{') stk.pop();
				else if(c == '}' && stk.peek() != '{') return false;
			}
		}

		return stk.size() == 0;
	}
}

public class Easy_Valid_Parentheses
{
	public static void main(String[] args)
	{
		String s = "([{}])";
		Solution solution = new Solution();
		System.out.println(solution.ValidParentheses(s));
	}
}
