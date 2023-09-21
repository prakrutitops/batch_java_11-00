#include <stdio.h>
#include <conio.h>
#include <string.h>

void main()
{
	char pali[100];
	int loop,flag=2,length;
	clrscr();
	printf("Enter the String to check for Palindrome : ");
	scanf("%s",&pali);

	length=strlen(pali);

	for (loop=0;loop<=length;loop++)
	{

	      if (pali[loop] != pali[length-1])
	       {
			flag=0;
			break;
	       }
	       else
			length=length-1;
			flag=1;

	}
	if (flag == 1)
		printf("\nEnter String is Palindrome");
	else
		printf("\nEnter String is NOT Palindrome");

	getch();
}

