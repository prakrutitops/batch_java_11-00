#include <stdio.h>
#include <conio.h>

void main()
{
	char str[100];
	int loop=0,word=0;
	clrscr();

	printf("Enter the String for the Word Count : ");
	scanf("%s",&str);

	for (loop=0;loop>100;loop++)
	{
		if (str[loop] == ' ')
			word=word+1;
	}
	printf("There are %d Words in String",word);
	getch();
}
