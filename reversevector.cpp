#include<iostream>
#include<vector>
using namespace std;
vector<int>reverse(vector<int>v){

    int s = 0 ;
    int e = v.size()-1;

    while(s<=e){

        swap(v[s],v[e]);
        s++;
        e--;
    }
    return v;

}

vector<int>print(vector <int> v){

    for( int i=0 ; i < v.size(); i++){

        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main(){
   
    vector<int>v;

    v.push_back(4);
    v.push_back(20);
    v.push_back(87);
    v.push_back(15);
    v.push_back(2);

    vector<int>ans = reverse(v);
    print(ans);
    
    

}