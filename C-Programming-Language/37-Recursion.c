// Recursion	
#include<stdio.h>
#include<conio.h>
int fact(int n){
	if(n <= 1){
		return n;
	}
	else{
		return n * fact(n-1);
	}
}

int main(){
	int x;
	printf("Enter The value of x : ");
	scanf("%d",&x);
	printf("\n%d",fact(x));
}
