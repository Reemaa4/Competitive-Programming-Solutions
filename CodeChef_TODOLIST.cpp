#include "bits/stdc++.h"
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n,ans=0;cin>>n;
        for (int i = 0; i < n; ++i) {
            int v;cin>>v;
            if(v>999){
                ans++;
            }
        }
        cout<<ans<<endl;
    }
}
