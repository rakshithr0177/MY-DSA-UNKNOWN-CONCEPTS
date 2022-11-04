#include <bits/stdc++.h>
using namespace std;

int countDistintWays(long long nStairs){
	if (nStairs < 0 ){
		return 0 ;
	}
	if (nStairs == 0 ){
		return 1 ;
	}

	int forOneStep = countDistintWays(nStairs - 1 );
	int forTwoSteps = countDistintWays(nStairs - 2);
	return (forOneStep + forTwoSteps) ;
}

int main(){
	long n ;
	cin >> n ;
	cout << "Numbers of ways : "<< countDistintWays(n)<< endl ;
}
