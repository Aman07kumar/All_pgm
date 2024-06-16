#include<bits/stdc++.h>
using namespace std;
vector<int>prime(vector<int>v){
    int primecount=0;
    for (int i=2;i<v.size();i++){
        int count=0;
        for (int j=1;j<i/2;j++){
            if (i%j==0){
                count++;
                if (count >1)
                break;
            }
        }
        if (count==1){
            cout<<i<<endl;
            primecount++;
            v.push_back(i);
        }
    }
    cout<<primecount<<endl;
    return v;

}
vector<int>print( vector<int>v) {

    for(int i=0;i<v.size();i++){
      cout<<v[i]<" ";


    }
    cout<<endl;

    
}
int main(){
    vector<int>v;
    cout<<prime(10)<<endl;
    print(v);
    
}