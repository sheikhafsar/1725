#include<iostream>
#include "Staff.h"

Staff::Staff()
{
    cout << "Staff object created" <<endl;

    this->firstname = "";
    this->lastname = "";
}

Staff::Staff(string firstname)
{
    cout << "Staff object created with single parameter" <<endl;
    this->firstname = firstname;
    this->lastname = "";
}

Staff::Staff(string firstname, string lastname)
{
    cout << "Staff object created with 2 parameters" <<endl;
    this->firstname = firstname;
    this->lastname = lastname;
}

string Staff::getFullName()
{
    return this->firstname + " " + this->lastname;
}

Staff::~Staff()
{
    //dtor
}
