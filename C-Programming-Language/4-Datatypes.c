#include<stdio.h>
#include<conio.h>
int main()
{
	int myInt = 12;
	float myFloat = 12.266666666;
	char myChar = 'A';
	char mystr[20] = "Krishal Modi";
	long int myLint = 3864684;
	double mydbl = 12.2222844686848468;
	
	printf("\nPrinting Datatypes");
	printf("\n%d", myInt);
	printf("\n%f", myFloat);
	printf("\n%c", myChar);
	printf("\n%s", mystr);
	printf("\n%ld", myLint);
	printf("\n%lf", mydbl);
	
	// Defining Size of Datatypes
	
	printf("\nPrinting Size of each type");
	printf("\n%d", sizeof(myInt));
	printf("\n%d", sizeof(myFloat));
	printf("\n%d", sizeof(myChar));
	printf("\n%d", sizeof(mystr));
	printf("\n%d", sizeof(myLint));
	printf("\n%d", sizeof(mydbl));
	 
	 
	// Char using Ascii  
	
	printf("\nPrinting ASCII Character ");
	char a = 65;
	printf("\n%c",a);
	char b = 97;
	printf("\n%c",b);
	
}
