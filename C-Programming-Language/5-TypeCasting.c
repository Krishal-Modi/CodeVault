// Type casting
#include<stdio.h>
#include<conio.h>
int main()
{
	// Implicit = auto conversion
	
	int myfloat = 64.4654;
	printf("Implicit : %d", myfloat);

	// Explicit = Done by explicitly in parenthesis 
	
	int a = 5, b = 2;
	int c = a/b;
	printf("\nExplicit : %f", (float) c);
}
