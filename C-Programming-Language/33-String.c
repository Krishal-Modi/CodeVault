#include<stdio.h>
#include<string.h>
#include<conio.h>
int main(){
	char name[10] = "John";
	char name1[10] = "Mark";
	
	printf("%d",strlen(name));	
	printf("\n%s",strcat(name, name1));
	printf("\n%d",strcmp(name,name1));
	printf("\n%s",strcpy(name, name1));
	printf("\n%d",sizeof(name));
}
