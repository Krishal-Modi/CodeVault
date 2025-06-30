#include<stdio.h>
#include<conio.h>
int main(){
	int i,j,k,l;
	for(i=1;i<=6;i++){
		for(j=6;j>=i;j--){
			printf("   ");
		}
		for(k=1;k<=i;k++){
			printf(" * ");
		}
		for(l=2;l<=i;l++){
			printf(" * ");
		}
		printf("\n");
	}
	for(i=4;i<=10;i++){
		for(j=5;j<=i;j++){
			printf("   ");
		}
		for(k=9;k>=i;k--){
			printf(" * ");
		}
		for(l=10;l>=i;l--){
			printf(" * ");
		}
		printf("\n");
	}
}
