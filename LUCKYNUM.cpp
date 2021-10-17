#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int t;
	cin >> t;
	
	while(t--)
	{
	        int a[5],ind_win=0,eng_win=0;
	        for(int i=0;i<5;i++)
	        {
	                cin >> a[i];
	                if(a[i]==1)
	                        ind_win++;
	                else if(a[i]==2)
	                        eng_win++;
	        }
	        if(ind_win == eng_win)
	                cout <<"DRAW" << endl;
	        else if(ind_win > eng_win)
	                cout <<"INDIA" << endl;
	        else
	                cout <<"ENGLAND" << endl;
	       
	}
	return 0;
}
