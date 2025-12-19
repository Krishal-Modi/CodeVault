#include<stdio.h>
#include<conio.h>

void data(char name[], int age);

int main(){
	data("Rahul", 20);
	data("Aayush", 19);
}

void data(char name[], int age){
	printf("\n%s is %d years old",name,age);
}
