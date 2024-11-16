#include "bits/stdc++.h"
using namespace std;
int main()
{
    int n;cin>>n;
    int arr[n];
    for (int i = 0; i < n; ++i) {
        cin>>arr[i];
    }
    int count1=0,count2=n-1;
    int sumS=0,sumD=0;
    for (int i = 1; i <= n; ++i) {
        if(i%2==0){
            sumD+=max(arr[count1],arr[count2]);
        }else{
            sumS+=max(arr[count1],arr[count2]);
        }
        if(arr[count1]>arr[count2]){
            count1++;
        }else{
            count2--;
        }
    }
    cout<<sumS<<" "<<sumD;
}
