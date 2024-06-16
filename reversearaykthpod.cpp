#include<iostream>
#include<vector>
using namespace std;

vector<int>rotate(vector<int>num, int k){
    
    vector<int>temp(num.size());

    for (int i = 0 ; i < num.size() ; i++){

        temp[(i+k)%num.size()] = num[i];
    }
    num = temp;
    return num;
}
vector<int>print(vector<int>v){
   for(int i=0 ;i<v.size() ;i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

int main(){
     
     vector<int>num;

     num.push_back(5);
     num.push_back(6);
     num.push_back(7);
     num.push_back(8);
     num.push_back(9);
     num.push_back(10);

     vector<int>ans=rotate(num,3);

    print(ans);


     return 0;

}