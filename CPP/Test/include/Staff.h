
#include<string>
#include <iostream>
#ifndef STAFF_H
#define STAFF_H

using namespace std;

class Staff
{
    public:
        Staff();
        virtual ~Staff();
        void test();
        void setName(string first_name,string last_name);
        string getName();

    protected:


    private:
       string m_first_name;
       string m_last_name;

};

#endif // STAFF_H
