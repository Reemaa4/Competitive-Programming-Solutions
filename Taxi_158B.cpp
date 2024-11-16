#include "bits/stdc++.h"
using namespace std;
int main()
{
    int n,ans=0;cin>>n;
    int arr[n];
    for (int i = 0; i < n; ++i) {
        cin>>arr[i];
    }
    sort(arr,arr+n);
    for (int i = n-1,j=0; i >=j ; --i) {
        if(arr[i]<4){
            int v=arr[i];
            while(v+arr[j]<=4 &&j!=i){
                v+=arr[j];
                j++;
            }
            ans++;
        }else{
            ans++;
        }
    }
    cout<<ans;
}
