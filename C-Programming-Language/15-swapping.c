// Swapping in between 2 numbers
#include<stdio.h>
#include<conio.h>
int main(){
	int a,b,temp;
	printf("Enter a : ");
	scanf("%d",&a);
	printf("Enter b : ");
	scanf("%d",&b);
	temp = a;
	a = b;
	b = temp;
	printf("\nAfter Swap : ");
	printf("\na : %d",a);
	printf("\nb : %d",b);
	
}
