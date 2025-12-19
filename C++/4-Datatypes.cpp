#include<iostream>
using namespace std;
int main(){
	int a = 20;
	char ch = 'A';
	char name[] = "Hello";
	double d = 1252352.2565454;
	float f = 125565.35135;
	long int h = 787687878878786;
	const int cin = 45;
	cout <<"Int : " << a << " \tSize : " << sizeof(a) << endl;
	cout <<"Char : " << ch << " \tSize : " << sizeof(ch) << endl;
	cout <<"Name : " << name << " \tSize : " << sizeof(name) << endl;
	cout <<"Double : " << d << " \tSize : "<< sizeof(d) << endl;
	cout <<"Float : " << f << " \tSize : "<< sizeof(f) << endl; 
	cout <<"Long Int : " << h << " \tSize : "<< sizeof(h) << endl;
	cout <<"cin : " << cin << " \tSize : "<< sizeof(cin) << endl;      
}
