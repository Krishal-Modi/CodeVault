// Conditional Statement
#include<stdio.h>
int main(){
	printf("\nFirst Checking Weather the number is odd or even!!");
	int evennodd;
	printf("\nEnter The Number : ");
	scanf("%d",&evennodd);
	if(evennodd % 2 == 0)
	{
		printf("\nEven");
	}
	else
	{
		printf("\nOdd");
	}
	
	printf("\nNow lets check Valid age for voting");
	int age;
	printf("\nEnter Your age : ");
	scanf("%d",&age);
	if(age >= 18){
		printf("\nYou can vote");
	}
	else{
		printf("\nYou are not eligible for vote");
	}
}
