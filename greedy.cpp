#include<iostream>
#include<vector>
using namespace std;

int maxMeetings(int start[], int end[], int n)
    {    pair<int,int> a[n];
        for(int i=0;i<n;i++){
            a[i].first=end[i];
            a[i].second=start[i];
        }
        sort(a,a+n);
        
        
         int ans=1;
         int emax=a[0].first;
         
         for(int i=1;i<n;i++){
             
             if(a[i].second>emax){
               ans++;
              emax=a[i].first;
             }
            
        }
        return ans;
    }