#include "bits/stdc++.h"
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
        int x=0,y=0;
        string s;cin>>s;
        bool flag=true;
        for (int i = 0; i < n; ++i) {
            if(s.at(i)=='U'){
                y++;
            }else if(s.at(i)=='R'){
                x++;
            }else if(s.at(i)=='D'){
                y--;
            }else{
                x--;
            }
            if(x==1&&y==1){
                cout<<"YES"<<endl;
                flag= false;
                break;
            }
        }
        if(flag){
            cout<<"NO"<<endl;
        }
    }
}
