// Switch Statement
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
	int a,b;
	char ch;
	
	printf("Enter a : ");
	scanf("%d",&a);
	printf("Enter b : ");
	scanf("%d",&b);

	printf("Enter The operation to perform : ");
	scanf(" %c",&ch);
	
	switch(ch)
	{
		case '+':
			printf("%d",a+b);
			break;
		case '-':
			printf("%d",a-b);
			break;
		case '*':
			printf("%d",a*b);
			break;
		case '/':
			printf("%d",a/b);
			break;
		case '%':
			printf("%d",a%b);
			break;
		default:
			printf("No such operation");
			break;
	}
	return 0;
}
