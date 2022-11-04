#include <bits/stdc++.h>
using namespace std;

void towerOfHannoi(int noOfDisc,string start ,string temp ,string end){
	if(noOfDisc == 0){
		return  ;
	}
	towerOfHannoi(noOfDisc-1 , start , end , temp);
	cout<<"disc"<<noOfDisc <<" has moved from "<<start <<" to "<< end <<endl;
	towerOfHannoi(noOfDisc-1 , temp , start , end);
}

int main(){
	int n = 0;
	cin >> n ;
	towerOfHannoi(n,"start" , "temp" , "end");
}
