#include<iostream>
using namespace std;
int main(){
	int i,j,k,l;
	for(i=1;i<=5;i++){
		for(j=4;j>=i;j--){
			cout<<"   ";
		}
		for(k=1;k<=i;k++)
		{
			cout<<" * ";
		}
		for(l=2;l<=i;l++){
			cout<<" * ";
		}
		cout<<endl;
	}
	
	for(i=5;i<=8;i++){
		for(j=5;j<=i;j++){
			cout<<"   ";
		}
		for(k=8;k>=i;k--){
			cout<<" * ";
		}
		for(l=7;l>=i;l--){
			cout<<" * ";
		}
		cout<<endl;
	}
}
