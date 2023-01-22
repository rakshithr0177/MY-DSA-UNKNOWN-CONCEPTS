#include <bits/stdc++.h>
using namespace std;

void print1(int n ){
	for(int i = 1 ; i <= n ; i ++){
		for(int j = 1 ; j <= n ; j++){
			cout << "*" << " ";
		}
		cout << endl;
	}
}

void print2(int n){
	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= i ; j++ ){
			cout << "*"<<" "; 
		}
		cout << endl ;
	}
}

void print3(int  n){
	for(int i= 1 ;i <= n;i++){
		for(int j = 1; j <= i;j++){
			cout << j <<" ";
		}
		cout << endl;
	}
}

void print4(int  n){
	for(int i= 1 ;i <= n;i++){
		for(int j = 1; j <= i;j++){
			cout << i <<" ";
		}
		cout << endl;
	}
}

void print5(int  n){
	for(int i = 1 ;i <=n;i++){
		for(int j = 1; j<= n-i+1 ; j++){
			cout << "*"<<" ";
		}
		cout << endl;
	}
}

void print6(int  n){
	for(int i = 1 ;i <=n;i++){
		for(int j = 1; j<= n-i+1 ; j++){
			cout << j <<" ";
		}
		cout << endl;
	}
}

void print7o(int  n){
	for (int i = 1; i <= n; ++i)
	{
		for (int j = 1; j <= n-i; ++j)
		{
			cout<<" ";
		}
		for (int j = 1; j <= i; ++j)
		{
			cout<<"* ";
		}
		cout<< endl;
	}
}

void print8o(int n){
	for (int i = 1; i <= n; ++i)
	{
		for (int j = 1; j < i; ++j)
		{
			cout<<" ";
		}
		for (int j = 1; j <= n-i+1; ++j)
		{
			cout<<"* ";
		}
		cout<<endl;
	}
}

void print7(int n){
	for (int i = 1; i <= n; ++i)
	{
		//printing space
		for (int j = 1; j <=n-i ; ++j)
		{
			cout<<" ";
		}
		//printing star
		for (int j = 1; j <= 2*i-1; ++j)
		{
			cout<<"*";
		}
		//printing space
		for (int j = 1; j <= n-i; ++j)
		{
			cout<<" ";
		}
		cout<<endl;
	}
}

void print8(int n){
	for (int i = 1; i <= n; ++i)
	{
		//printing space
		for (int j = 1; j < i ; ++j)
		{
			cout<<" ";
		}
		//printing star
		for (int j = 1; j <= 2*(n-i+1)-1 ; ++j)
		{
			cout<<"*";
		}
		//printing space
		for (int j = 1; j <= i; ++j)
		{
			cout<<" ";
		}
		cout<<endl;
	}
}

void print9(int n){
	print7(n);
	print8(n);
}

void print10(int n){
	for(int i = 1 ;i <= 2*n-1;i++ ){
		int stars = i ;
		if (stars > n)
		{
			stars = 2*n - stars;
		}
		for (int j = 1; j <= stars; ++j)
		{
			cout<<"*";
		}
		cout<<endl;
	}
}

void print11(int n){
	for(int i = 0 ; i < n ; i++)
	{
		int start ;
		if(i %2 == 0){
			start = 1;
		}else{
			start = 0 ;
		}
		for (int j = 0; j <= i; ++j)
		{
			cout<<start<<" ";
			start = 1 - start;
		}
		cout<<endl;
	}
}

void print12(int n){
	for (int i = 1; i <=n; ++i)
	{
		for (int j = 1 ; j <= i; ++j)
		{
			cout<<j;
		}
		for (int k = 1; k <= 2*(n-i); k++)
		{
			cout<<" ";
		}
		for (int j = i ; j > 0; --j)
		{
			cout<<j;
		}
		cout <<endl;
	}
}

void print13(int n){
	int count = 0;
	for (int i = 1; i <= n; ++i)
	{
		for (int j = 1; j <= i; ++j)
		{
			count++;
			cout<<count<<" ";
		}
		cout<<endl;
	}
}

void print14(int n){
	char ch = 'A';
	for (int i = 1; i <= n; ++i)
	{
		for (char ch = 'A'; ch < 'A'+ i; ++ch)
		{
			cout<<ch<<" ";
		}
		cout<<endl;
	}
}

void print15(int n){
	char ch = 'A';
	for (int i = 1; i <= n; ++i)
	{
		for (char ch = 'A'; ch <= 'A'+ (n-i); ++ch)
		{
			cout<<ch<<" ";
		}
		cout<<endl;
	}
}

void print16(int n){
	char ch = 'A';
	for (int i = 0; i < n; ++i)
	{
		for (int j = 0; j <= i; ++j)
		{
			cout<<ch <<" ";
		}
		ch = ch + 1;
		cout <<endl ;
	}
}

void print17(int n){
	char  c ;
	for(int i = 0; i < n ; i++){
		c = 'A';
		for(int j = 0 ; j < n-i-1 ; j++){
			cout << ' ';
		}
		for( int j = 0 ; j < 2 * i + 1 ; j++){
			cout << c ;
			c = j < (2 * i + 1)/2 ? (c + 1) : (c - 1);
		}
		cout<<endl ;
	}
}

void print18(int n){
	char c = 'A';
	for(int i = 0 ; i< n ;i++){
		for(int j = n - i - 1 ;  j < n ; j++ ){
			cout << char(c+j);
		}
		cout<<endl;
	}
}

void printTriangle(int n) {
    char c = 'A' + n - 1;
	for(int i = 0 ; i< n ;i++){
		for(int j = 0 ; j <= i ; j++){
		    cout << char(c - j) << " ";
		}
		cout<<endl;
	}
}

void print19(int n){
	for(int i = 0 ; i < n ; i++){
		for(int j  = 0 ;j < n-i ; j++){
			cout << "*";
		}
		for(int j  = 0 ;j < 2*i ; j++){
			cout << " ";
		}
		for(int j  = 0 ;j < n-i ; j++){
			cout << "*";
		}
		cout<< endl ;
	}
	for(int i = 0 ; i < n ; i++){
		for(int j  = 0 ;j <= i ; j++){
			cout << "*";
		}
		for(int j  = 0 ;j < 2*(n-i-1); j++){
			cout << " ";
		}
		for(int j  = 0 ;j <= i ; j++){
			cout << "*";
		}
		cout<<endl;
	}
}

void print20(int n){
	for(int i =0 ; i < n ; i++){
		for(int j  = 0 ;j <= i ; j++){
			cout << "*";
		}
		for(int j  = 0 ;j < 2*(n-i-1); j++){
			cout << " ";
		}
		for(int j  = 0 ;j <= i ; j++){
			cout << "*";
		}
		cout<<endl;
	}
	for(int i = 0 ; i < n ; i++){
		for(int j  = 0 ;j < n-i-1 ; j++){
			cout << "*";
		}
		for(int j  = 0 ;j < 2*(i+1) ; j++){
			cout << " ";
		}
		for(int j  = 0 ;j < n-i-1 ; j++){
			cout << "*";
		}
		cout<< endl ;
	}
}

void print21(int n){
	for(int i = 0 ;  i < n ; i++){
		for (int j= 0; j< n ;  j++){
			if(i == 0 || j==0 || i == n-1 || j == n-1){
				cout<<"*";
			}
			else{
				cout<< " ";
			}
		}
		cout<< endl ;
	}
}

void print22(int n){
	for(int i=0 ; i < 2*n-1 ;i++){
		for(int j = 0 ; j < 2*n-1 ; j++){
			int top = i ;
			int left = j;
			int right = 2*(n-1)-j;
			int bottom = 2*(n-1)-i;
			cout<< n-min(top,min(left,min(right,bottom)))<<" ";
		}
		cout <<endl;
	}
}

int main(){
	int testCases ; 
	cin >> testCases;
	for(int i =  1 ; i <= testCases ; i++){
		int n ;
		cin >> n ;
		print22(n);
	}
}
		