#include <iostream>
using namespace std;
class Person {
public:
    string dob="14 Jan 2003";
    void displayPersonInfo() {
        cout<<"DOB -> "<<dob<<endl;
    }
};
class Employee : public Person {
public:
    string emp_id="104";
    void displayEmployeeInfo() {
        cout<<"DOB -> "<<dob<<endl;
        cout<<"Employee id -> "<<emp_id<<endl;
    }
};

class Manager : public Employee {
public:
    string dep="IT";

    void displayManagerInfo() {
        cout<<"DOB -> "<<dob<<endl;
        cout<<"Employee id -> "<<emp_id<<endl;
        cout << "Department -> "<<dep<< endl;
    }
};

int main() {
    Manager m;
    
    m.displayManagerInfo();

    return 0;
}
