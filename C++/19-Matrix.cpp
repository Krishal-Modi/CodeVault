#include<iostream>
using namespace std;
int main(){
	int a[3][3],i,j;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			cout<<"Enter a["<<i<<"]["<<j<<"] : "<<endl;
			cin>>a[i][j];
		}
	}
	
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			cout<<a[i][j];
		}
		cout<<endl;
	}
}
