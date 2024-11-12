#include<iostream>
using namespace std;
double simpleInterest(int p,int t,int r=10){
    double si = (p*r*t)/100.0;
    return si;
}
int main(){
    cout<<"Enter Principal : ";
    int p;
    cin>>p;
    cout<<"Enter Time : ";
    int t;
    cin>>t;
    cout<<"Enter rate or -1 to use default value (10%) ";
    int r=-1;
    cin>>r;
    if(r==-1){
        cout<<"Simple Interest = "<<simpleInterest(p,t)<<endl;
    }
    else{

        cout<<"Simple Interest = "<<simpleInterest(p,t,r)<<endl;
    }
}