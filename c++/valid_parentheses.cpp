#include <stack>
#include <string>
#include <iostream>

bool ValidParentheses(std::string string)
{
	if(string.length() % 2 != 0) return false;

	std::stack<char> stack;

	for(char character : string)
	{
		if(character == '(' || character == '[' || character == '{') stack.push(character);

		if(stack.empty())
		{
			if(character == ')' || character == ']' || character == '}') return false;
		}

		if(!stack.empty())
		{
			if(character == ')' && stack.top() == '(') stack.pop();
			else if(character == ')' && stack.top() != '(') return false;

			if(character == ']' && stack.top() == '[') stack.pop();
			else if(character == ']' && stack.top() != '[') return false;

			if(character == '}' && stack.top() == '{') stack.pop();
			else if(character == '}' && stack.top() != '{') return false;
		}
	}

	return stack.empty();
}

std::string string = {"([}}])"};

int main()
{
	std::cout << std::boolalpha << ValidParentheses(string) << "\n";
}