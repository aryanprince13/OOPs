#include<iostream>
using namespace std;
class Rectangle{
    private:
        int l,b;
    public:
    int getLength(){
        return l;
    }
    int getBreath(){
        return b;
    }
    void display(){
        cout<<"Length -> "<<this->l<<endl;
        cout<<"Breath -> "<<this->b<<endl;
    }
    Rectangle(){
        l=10,b=10;
    }
    Rectangle(int b){
        this->b=b;
        l=10;
    }
    Rectangle(int l,int b){
        this->b=b;
        this->l=l;
    }
    Rectangle(const Rectangle &ob){
        this->b=ob.b;
        this->l=ob.l;
        cout<<"Copy constructor called"<<endl;
    }
};
int main(){
    cout<<"Making object with no parameter constructor"<<endl;
    Rectangle a;
    a.display();
    cout<<"Making object with 1 parameter constructor"<<endl;
    Rectangle b(5);
    b.display();
    cout<<"Making object with 2 parameter constructor"<<endl;
    Rectangle c(100,50);
    c.display();
    cout<<"Making object with copy constructor"<<endl; 
    Rectangle d(c);
    d.display();
}