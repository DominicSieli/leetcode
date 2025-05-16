#include <map>
#include <string>
#include <iostream>

int RomanToInteger(std::string string)
{
	int integer = 0;
	std::map<char, int> numerals;

	numerals['I'] = 1;
	numerals['V'] = 5;
	numerals['X'] = 10;
	numerals['L'] = 50;
	numerals['C'] = 100;
	numerals['D'] = 500;
	numerals['M'] = 1000;

	for(unsigned int i = 0; i < string.length(); i++)
	{
		if(i + 1 >= string.length())
		{
			integer += numerals[string[i]];
		}

		if(i + 1 < string.length())
		{
			if(numerals[string[i]] >= numerals[string[i + 1]]) integer += numerals[string[i]];
			if(numerals[string[i]] < numerals[string[i + 1]]) {integer += numerals[string[i + 1]] - numerals[string[i]]; i++;}
		}
	}

	return integer;
}

std::string string_1 = "IV";
std::string string_2 = "IX";
std::string string_3 = "III";
std::string string_4 = "LVIII";
std::string string_5 = "MMCXVI";
std::string string_6 = "MCMXCIV";

int main()
{
	std::cout << RomanToInteger(string_1) << '\n';
	std::cout << RomanToInteger(string_2) << '\n';
	std::cout << RomanToInteger(string_3) << '\n';
	std::cout << RomanToInteger(string_4) << '\n';
	std::cout << RomanToInteger(string_5) << '\n';
	std::cout << RomanToInteger(string_6) << '\n';
}