// Factorial using While Loop 
#include<stdio.h>
#include<conio.h>
int main()
{
	int i, no, ans=1;
	printf("Enter The Number : ");
	scanf("%d",&no);
	i = 1;
	while(i<=no){
		ans = i * ans;
		printf("\n%d",ans);
		i++;
	}
	
}






//	int i = 1;
//	int  ans=1, no;
//	printf("Enter the number : ");
//	scanf("%d",&no);
//	while(i<=10){
//		ans = i * no;
//		i++;
//		printf("\n%d * %d = %d", no, i,ans);
//	}
