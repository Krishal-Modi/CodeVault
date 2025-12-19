#include<stdio.h>
int main(){
	int no[] = {10,20,30,40,50,60};
	printf("%d",no[1]);
	no[2] = 100;
	printf("\n%d",no[2]);
	int arr[4];
	arr[0] = 1;
	arr[1] = 3;
	arr[2] = 6;
	arr[3] = 9;	
	int i;
	for(i=0;i<4;i++)
	{
		printf("\n%d",arr[i]);
	}
	printf("\n");
	int j;
	int marr[3][3] = {{2,3,5},{9,6,5},{2,6,8}};
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			printf("%d",marr[i][j]);
		}
		printf("\n");
	}
}
