import java.util.*;

class Solution
{
	public boolean ValidParentheses(String str)
	{
		if(str.length() % 2 != 0) return false;

		Stack<Character> stk = new Stack<Character>();

		for(char character : str.toCharArray())
		{
			if(character == '(' || character == '[' || character == '{') stk.push(character);

			if(stk.size() == 0)
			{
				if(character == ')' || character == ']' || character == '}') return false;
			}

			if(stk.size() != 0)
			{
				if(character == ')' && stk.peek() == '(') stk.pop();
				else if(character == ')' && stk.peek() != '(') return false;

				if(character == ']' && stk.peek() == '[') stk.pop();
				else if(character == ']' && stk.peek() != '[') return false;

				if(character == '}' && stk.peek() == '{') stk.pop();
				else if(character == '}' && stk.peek() != '{') return false;
			}
		}

		return stk.size() == 0;
	}
}

public class ValidParentheses
{
	public static void main(String[] args)
	{
		String str = "([{}])";
		Solution solution = new Solution();
		System.out.println(solution.ValidParentheses(str));
	}
}
