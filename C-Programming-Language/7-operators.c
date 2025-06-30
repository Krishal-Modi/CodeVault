// Operators
#include<stdio.h>
int main()
{
	int a = 30, b = 20;
	
	printf("Operators");
	
	printf("\n\nArithmetic Operators\n");
	printf("\nAddition : %d",(a+b));
	printf("\nSubtraction : %d",(a-b));
	printf("\nMultiplication : %d",(a*b));
	printf("\nDivision : %d",(a/b));
	printf("\nModulus : %d",(a%b));
	printf("\nIncrement : %d",(++a));
	printf("\nDecrement : %d",(--b));
	
	
	printf("\n\nAssignment Operators\n");
	a = 30;
	b = 20;
	int c = 25;
	printf("\n+= : %d",a+=20);
	printf("\n-= : %d",a-=10);
	printf("\n*= : %d",a*=2);
	printf("\n/= : %d",a/=3);
	printf("\n%= : %d",a%=20);
	printf("\n&= : %d",a&=20); // 30  = 00011110  ->  20  = 00010100
	printf("\n|= : %d",a|=20);
	printf("\n^= : %d",a^=20);
	printf("\n>>= : %d",b>>=2);
	printf("\n<<= : %d",c<<=2);
	
	printf("\n\nComparison Operators\n");
	a = 30;
	b = 20;
	c = 25;
	printf("\n(a!=b) : %d",(a!=b));
	printf("\n(a>b) : %d",a>b);
	printf("\n(a<b) : %d",a<b);
	printf("\n(a==b) : %d",a==b);	
	
	
	printf("\n\nLogical Operators\n");
	a = 30;		// 00011110
	b = 20;		// 00010100
	printf("\n&& : %d",a>10 && b<<25);
	printf("\n|| : %d",a>30 || b<20);
	printf("\n!= : %d",a!=b);

}
