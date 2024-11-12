#include<iostream>
using namespace std;
void callByValue(int a,int b){
    int temp=a;
    a=b;
    b=temp;
}
void callByReference(int &a,int &b){
    int temp=a;
    a=b;
    b=temp;
}
int main(){
    int a,b;
    cout<<"Enter value of a: ";
    cin>>a;
    cout<<"Enter value of b: ";
    cin>>b;
    callByValue(a,b);
    cout<<"After call by value"<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl<<endl;

    callByReference(a,b);
    cout<<"Call by reference"<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;
}