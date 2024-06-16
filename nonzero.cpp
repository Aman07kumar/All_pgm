#include<iostream>
#include<vector>
using namespace std;

vector<int>nonzero(vector<int>v){
    int nonzero=0;

    for(int i=0 ;i<v.size(); i++){

        if (v[i]!=0){

            swap(v[i],v[nonzero]);
            nonzero++;

        }

    }
    return v;
}
vector<int>print(vector<int>v){
   for(int i=0 ;i<v.size() ;i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main(){
    vector<int>v;
    v.push_back(12);
    v.push_back(0);
    v.push_back(0);
    v.push_back(0);
    v.push_back(12);

    vector<int>ans=nonzero(v);
    print(ans);

   

    return 0;
}