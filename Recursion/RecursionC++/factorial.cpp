#include <bits/stdc++.h>
using namespace std;

int factorial(int n){
	
	if(n == 0){
		return 1;
	}

	int smallerProblem = factorial(n-1);

	int largerProblem = n * smallerProblem ;

	return largerProblem;
}

int main(){
	int n ;
	cin >> n ;
	int ans = factorial(n);
	cout<< ans <<endl ;
}
