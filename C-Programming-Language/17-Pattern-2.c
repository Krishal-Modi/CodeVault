// Pattern - 2
#include<stdio.h>
#include<conio.h>
int main(){
	int i,j,no;
	printf("Enter The No of Stars : ");
	scanf("%d",&no);
	
	for(i=1;i<=no;i++)
	{
		for(j=no;j>=i;j--)
		{
			printf(" * ");
		}
		printf("\n");
	}
} 
