#include <iostream>
#include "Staff.h"


using namespace std;

int main()
{
    cout << "University!" << endl;

  //  Staff *s1= new Staff("Afsar");
    Staff s1("Afsar");
    NonTeachingStaff s2("Vishu");

    cout<< s1.getFullName() << endl;
    cout<< s2.getFullName() << endl;

    return 0;
}
