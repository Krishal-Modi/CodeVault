// Pattern - 3
#include<stdio.h>
#include<conio.h>
int main(){
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" * ");
		}
		printf("\n");
	}
	for(i=1;i<=4;i++)
	{
		for(j=4;j>=i;j--)
		{
			printf(" * ");
		}
		printf("\n");
	}
} 
