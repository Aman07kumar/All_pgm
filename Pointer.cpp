#include<bits/stdc++.h>
using namespace std;

// void print (int *p){
//     cout << *p <<endl;
// }

// void update(int& n){
//     n++;
// }

// int getsum(int *arr ,int n){

//     int sum=0;

//     for (int i=0 ; i<n ;i++){
//         sum = sum + arr[i];

//     }
//     return sum;
// }
 
int main(){

    // int num=5;

    // int *ptr = &num;  
    // cout<<num<<endl;

    // //Address of operator ---&

    // // cout<<"the value of num is :"<<*ptr++<<endl;
    // cout<<"the value of num is :"<<++*ptr<<endl;
    // cout<<"The size of integer is "<< sizeof(num) <<endl;
    // cout<<"The size of  is pointer "<< sizeof(ptr) <<endl;
    //  int arr[10]= {0,5,3};
    //  cout <<"Address of first memory block is "<< arr << endl;
    //  cout <<"Adress of first memory block is "<<&arr[0] << endl;
    //  cout << "4th value" << *arr << endl;
    //  cout << "4th value " << *arr+1 << endl;
    //  cout << "4th value " << *(arr+1) << endl;

    //  int i=1;
    //  cout << i[arr] <<endl;

    // int arr[10];

    // // arr = arr + 1;
    // // cout << arr <<endl; ERROR

    // int *p = &arr[0];
    // cout << p << endl;
    // p=p+1;
    // cout << p << endl;


    // CHAR
    
    // char ch[6]="abcde";

    // cout << ch <<endl;


    // char *c = &ch[0];
    // //print entire string 
    // cout << c << endl;

    // int value = 5;
    // int *p = &value;
    // print(p);
    // int i=5;
    // int* p = &i;
    // int** p2 = &p;

    // cout << *p2 << endl;
    // **p2=**p2+1;
    // cout << **p2 << endl;

    // int i=5;
    
    // int &j = i;

    // cout << i << endl;
    // i++;
    // cout << i<< endl;
    // j++;
    // cout << j<< endl;

    // int n = 5;

    // cout <<"Before value " << n << endl;

    // update(n);
    // cout <<"After value " << n << endl;

    //  int n;
    //  cin >> n;

    // //variable size of array
    //  int *arr = new int[n];


    //  // taking input for an array

    //  for (int i=0 ; i<n ;i++){
    //     cin >> arr[i]; 
    //  }
      
    //   int ans =getsum(arr,n);
    //   cout << "The answer is " << ans << endl;
    int n;
    cin>> n;
    int** arr = new int*[n];

    for (int i=0 ; i<n ; i++){
        arr[i]=new int[n];

    }

    //creation done

    //taking ilp
    for (int i=0 ;i<n;i++){
        for (int j=0 ;j<n ;j++){
            cin >> arr[i][j];
        }
    }

    cout << endl;

    //output
    for (int i=0 ;i<n;i++){
        for (int j=0 ;j<n ;j++){
            cout << arr[i][j] << " "<< endl;
        }
    }

    //release memory

    for ( int i=0 ; i<n ;i++ ){
        delete [] arr[i];
    }

    delete []arr;



   

    


    return 0;
}