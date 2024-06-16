#include<iostream>
#include<vector>
using namespace std;
vector<int> getConcatenation(vector<int> nums) {
        vector<int> ans;
        for (int i=0;i<nums.size();i++){
            ans.push_back(nums[i]);
        }
        for(int i=0;i<nums.size();i++){
            ans.push_back(nums[i]);
        }
        return ans;
}///wrong answer

vector<int>print(vector <int> v){

    for( int i=0 ; i < v.size(); i++){

        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main(){
   
    vector<int>v;

    vector<int>ans = getConcatenation(ans);
    print(ans);

}