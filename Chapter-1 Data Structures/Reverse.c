#include<stdio.h>
#include<string.h>
void reverse(char *str)
{
	char* end= str;
	char tmp;
	if(str)
	{while(*end)
	{
		end++;
	}
	end--;
	while(str < end)
	{
		tmp = *str;
		*str = *end;
		*end = tmp;
		end--;
		str++;
	}
}}

int main()
{
	char Str[10];
	printf("Enter the String\n");
	scanf("%s",Str);
	reverse(Str);
	printf("%s\n", Str);
	return 0;
}
