#include "NonTeachingStaff.h"

NonTeachingStaff::NonTeachingStaff()
{
    //ctor
}

NonTeachingStaff::NonTeachingStaff(string firstname, string lastname)
{
    cout << "nonteaching Staff object created with 2 parameters" <<endl;
    this->firstname = firstname;
    this->lastname = lastname;
}

NonTeachingStaff::~NonTeachingStaff()
{
    //dtor
}
