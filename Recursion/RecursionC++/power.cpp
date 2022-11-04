#include <bits/stdc++.h>
using namespace std;

double power(int a ,int b){
	if(b == 0){
		return 1 ;
	}
	// this is for even 
	else if( b%2 == 0){
		double half = power(a , b/2);
		return half*half ;
	}
	// this is for odd
	else if(b % 2 != 0){
		double half = power(a , b/2);
		return a * half * half ;
	}
}

int main(){
	int a  , b ;
	cin>> a  >> b ;
	cout << a<< " to the power "<< b <<" is "<< power(a , b)<<endl ;
}
