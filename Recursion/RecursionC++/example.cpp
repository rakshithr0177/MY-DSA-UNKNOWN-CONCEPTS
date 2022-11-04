#include <bits/stdc++.h>
using namespace std;

void reachHome(int src , int des){

	cout<< "source: " << src <<" and destination: "<< des << endl ;
	if(src == des){
		cout<< "I reached home "<< endl ;
		return ;
	}

	reachHome(src+1 ,  des);

}

int main(){
	int src , des ;
	cin >> src >> des ;
	reachHome(src ,  des);
}
