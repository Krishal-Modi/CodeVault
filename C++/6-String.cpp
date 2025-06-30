#include<iostream>
using namespace std;
int main(){
	string name = "Hello ";
	cout << name;
	cout<< name[0];
	
	string name1 = "World";
	cout <<endl<< name.append(name1);
	cout<<endl<< name.length(); 
	
	string value;
	cout<<endl<< "Enter The value : ";
	cin>> value;
	cout<<endl<< "Value is : " << value;
}
