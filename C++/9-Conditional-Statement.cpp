#include<iostream>
using namespace std;
int main(){
	int a,b,c;
	cout<<"Enter A : ";
	cin>>a;
	cout<<"Enter B : ";
	cin>>b;
	cout<<"Enter C : ";
	cin>>c;
	
	if(a>b && a>c){
		cout<<a <<" is greatest";
	}
	else if(b>a && b>c){
		cout<<b <<" is greatest";
	}
	else{
		cout<<c <<" is greatest";
	}
}
