#include<iostream>
using namespace std;
int main(){
	int a,b;
	char ch;
	cout<<"Enter a : "<<endl;
	cin>>a;
	cout<<"Enter b : "<<endl;
	cin>>b;
	cout<<"Enter The Operator : "<<endl;
	cin>>ch;
	
	switch(ch)
	{
		case '+':
			cout<<"Addition : " << (a+b);
			break;
		case '-':
			cout<<"Subtraction : " << (a-b);
			break;
		case '*':
			cout<<"Multiplication : " << (a*b);
			break;
		case '/':
			cout<<"Division : " << (a/b);
			break;
		case '%':
			cout<<"Modulus : " << (a%b);
			break;
		default:
			cout<<"There is no such operator";
			break;
	}
	
}
