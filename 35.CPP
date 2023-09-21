#include <stdio.h>
#include <conio.h>

void main()
{
	char oldstr[100],newstr[100];
	int loop;
	clrscr();
	printf("Enter the String to Copy : ");
	scanf("%s",&oldstr);

	for (loop=0;loop<100;loop++)
		newstr[loop]=oldstr[loop];
	printf("New string is %s",newstr);
	getch();
}
