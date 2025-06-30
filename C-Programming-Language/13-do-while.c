// Fibonnaci Series for Do While Loop
#include<stdio.h>
#include<conio.h>
int main()
{
	int i=1,n1 = 0, n2 = 1, n3, no;
	printf("Enter the Number : ");
	scanf("%d",&no);
	printf("\n%d \n%d",n1,n2);
	do{
		n3 = n1 + n2;
		printf("\n%d",n3);
		n1 = n2;
		n2 = n3;
		i++;
	}while(i<=no);
	
}
