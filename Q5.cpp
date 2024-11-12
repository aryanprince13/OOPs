#include <iostream>
using namespace std;

// Base class for Student
class Student {
protected:
    float marks1, marks2, marks3;
    
public:
    // Constructor to initialize marks
    Student(float m1, float m2, float m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Virtual function to calculate total marks
    virtual float calculateTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Virtual destructor
    virtual ~Student() {
        cout << "Student base class destructor called." << endl;
    }
};

// Derived class from Student for Science students
class ScienceStudent : public Student {
public:
    // Constructor to initialize marks for Science student
    ScienceStudent(float m1, float m2, float m3) : Student(m1, m2, m3) {}

    // Override the virtual function to calculate total marks
    float calculateTotalMarks() override {
        return marks1 + marks2 + marks3;
    }

    ~ScienceStudent() {
        cout << "ScienceStudent class destructor called." << endl;
    }
};

// Derived class from Student for Arts students
class ArtsStudent : public Student {
public:
    // Constructor to initialize marks for Arts student
    ArtsStudent(float m1, float m2, float m3) : Student(m1, m2, m3) {}

    // Override the virtual function to calculate total marks
    float calculateTotalMarks() override {
        return marks1 + marks2 + marks3;
    }

    ~ArtsStudent() {
        cout << "ArtsStudent class destructor called." << endl;
    }
};

// Main function
int main() {
    // Creating objects of Science and Arts students
    ScienceStudent scienceStudent(85.5, 90.0, 88.0);  // Marks for Science
    ArtsStudent artsStudent(78.0, 82.5, 80.0);      // Marks for Arts

    // Displaying total marks using base class pointers
    Student* studentPtr = &scienceStudent;
    cout << "Total marks for Science student: " << studentPtr->calculateTotalMarks() << endl;

    studentPtr = &artsStudent;
    cout << "Total marks for Arts student: " << studentPtr->calculateTotalMarks() << endl;

    return 0;
}
