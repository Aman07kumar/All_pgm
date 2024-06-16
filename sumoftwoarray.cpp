#include<iostream>
#include<vector>
using namespace std;
vector<int>sum(vector<int>a,int n,vector<int>b,int m){
    
    int carry = 0;
    int i= n-1;
    int j = m-1;
    vector<int>ans;

    while(i>=0 && j>=0){

        int val1=a[i];
        int val2=b[j];

        int sum=val1+val2+carry;

        carry=sum/10;
        int temp =sum%10;
        ans.push_back(temp);
        i--;
        j--;
        
    }
    while (i>=0)
    {
        int sum=a[i]+carry;
        carry=sum/10;
        int temp=sum%10;
        ans.push_back(sum);
        i--;
    }
     while (j>=0)
    {
        int sum=a[j]+carry;
        carry=sum/10;
        int temp=sum%10;
        ans.push_back(temp);
        j--;
    }
    while (carry!=0)
    {
        int sum= carry;
        carry=sum/10;
        int temp=sum%10;
        ans.push_back(temp);
        
    }
    return ans;
}
    
vector<int>print( vector<int>a) {

    for(int i=0;i<a.size();i++){
      cout<<a[i]<" ";


    }
    cout<<endl;

    
}
vector<int>reverse(vector<int>a){

    int s = 0 ;
    int e = a.size()-1;

    while(s<=e){

        swap(a[s],a[e]);
        s++;
        e--;
    }
    return a;

}



int main() {

    vector<int>a;
    vector<int>b;
    a.push_back(1);
    a.push_back(1);
    b.push_back(2);
    b.push_back(3);

    vector<int>ans=sum(a,2,b,2);
    print(ans);
    
  return 0;
}