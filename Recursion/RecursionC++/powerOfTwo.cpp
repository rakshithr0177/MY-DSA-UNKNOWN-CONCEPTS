#include <bits/stdc++.h>
using namespace std;

int powerOfTwo(int n){
	if(n==0){
		return 1 ;
	}
	int smallerProblem = powerOfTwo(n-1);
	int largerProblem = 2 * smallerProblem; 
	return largerProblem;
}

int main(){
	int n ;
	cin >> n ;
	cout<< powerOfTwo(n)<< endl;
}
