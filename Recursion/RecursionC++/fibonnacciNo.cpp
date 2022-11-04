#include<iostream>
using namespace std;

int fibonacci(int n){
	if( n == 0 || n ==  1){
		return n ;
	}

	int prevTerm = fibonacci(n - 1); 
	int prevPrevTerm = fibonacci(n - 2);

	return prevTerm+prevPrevTerm;

}

int main(){
	int n ;
	cin >> n; 
	cout << fibonacci(n);
	return 0;
}
