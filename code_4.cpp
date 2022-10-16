// battery low problem solution

#include <iostream>
using namespace std;

int main() {
    int n,t=0;
    cin>>t;
	while(t--){
	    cin>>n;
	    cout<<((n<=15)?"Yes\n":"No\n") ;
	}
	return 0;
}
