#include<iostream>
using namespace std;
int getlength( char name[]){

    int count = 0;

    for (int i = 0 ; name[i] != '\0' ; i++){

        count++;
    }

    return count;                     

}
int main(){

    char name[20];

    cout << "enter your name: "<<endl;
    cin >> name ;
    //name[2]='\0'; // after second inddex it will take null value

    cout << "your name is ";
    cout << name << endl;

    int result  = getlength(name);
    cout<<"the length of the string"<<endl;
    cout<<result<<endl;

    return 0;
}

 // In case of aman kumar it is taking null value soo only we are etting aman as output   