#include <iostream>
#include "Staff.h"
#include "NonTeachingStaff.h"

#include<string>
using namespace std;

int main()
{
    cout << "Hello world!" << endl;


    NonTeachingStaff n1;

   n1.setName("Anish","Rao");
    n1.SetPay(992200);
    n1.Setage(21);

    cout << n1.getName() << endl;
    cout << "age : " << n1.Getage() << " salary : "  << n1.GetPay() << endl;

    return 0;
}
