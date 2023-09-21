#include <stdio.h>
#include <conio.h>

void main()
{
	char name[100];
	int loop,length=0;

	clrscr();
	printf("Enter name : ");
	scanf("%s",&name);

	//printf("Name is : %s",name);

	for(loop=0;loop<100;loop++)
	{
		if (name[loop] != '\0')
		     length=length++;
		else
		     break;
	 }
	 printf("Lenght is %d",length);
	getch();
}

