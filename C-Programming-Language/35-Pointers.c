#include<stdio.h>
#include<conio.h>
int main(){
	int a =10;
	printf("%d",&a);
	int *ptr = &a;
	printf("\n%d",ptr);
	printf("\n%d",*ptr); // Dereferencing
	
	// Using Pointers in array
	int arr[5] = {1,2,3,4,5};
	int i;
	for(i=0;i<=4;i++){
		printf("\n%p",&arr[i]);
	}	
}
