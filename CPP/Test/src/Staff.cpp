#include "Staff.h"


Staff::Staff()
{
    cout << "Staff created" << endl;
}

Staff::~Staff()
{
    cout << "Staff destroyed" << endl;
}

void  Staff::test()
 {
     cout << "Test" << endl;
 }

 void Staff::setName(string first_name,string last_name){
    m_first_name = first_name;
    m_last_name = last_name;
 }

 string Staff::getName(){

    return  "name : " + m_first_name +  " "  + m_last_name ;

 }


