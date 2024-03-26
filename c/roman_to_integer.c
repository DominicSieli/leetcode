#include <stdio.h>
#include <string.h>

int numerals(char character)
{
	switch(character)
	{
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
	}

	return 0;
}

int roman_to_integer(char* string)
{
	int integer = 0;

	for(int i = 0; i < strlen(string); i++)
	{
		if(i + 1 >= strlen(string))
		{
			integer += numerals(string[i]);
		}

		if(i + 1 < strlen(string))
		{
			if(numerals(string[i]) >= numerals(string[i + 1])) integer += numerals(string[i]);
			if(numerals(string[i]) < numerals(string[i + 1])) {integer += numerals(string[i + 1]) - numerals(string[i]); i++;}
		}
	}

	return integer;
}

char* string_1 = "IV";
char* string_2 = "IX";
char* string_3 = "III";
char* string_4 = "LVIII";
char* string_5 = "MMCXVI";
char* string_6 = "MCMXCIV";

int main()
{
	printf("%d\n", roman_to_integer(string_1));
	printf("%d\n", roman_to_integer(string_2));
	printf("%d\n", roman_to_integer(string_3));
	printf("%d\n", roman_to_integer(string_4));
	printf("%d\n", roman_to_integer(string_5));
	printf("%d\n", roman_to_integer(string_6));
}