#include <bits/stdc++.h>
using namespace std;
void inserting(vector<int>&v,int temp)
{
    if (v.size()==0 || v[v.size()-1]<=temp){
        v.push_back(temp);
        return ;
    }
    int x=v[v.size()-1];
    v.pop_back();
    inserting(v,temp);
    v.push_back(x);

}
void sorting(vector<int>&v){
    if (v.size()==0){
        return;
    }
    int temp=v[v.size()-1];
    v.pop_back();
    sorting(v);
    inserting(v,temp);
}
int main(){
    vector<int>v;
    v.push_back(0);
    v.push_back(1);
    v.push_back(5);
    v.push_back(2);
    v.push_back(3);
    sorting(v);
    for( int i =0;i<v.size();i++){
        cout<<v[i]<<endl;
    }
//    cout<<it<<" ";
    return 0;
}