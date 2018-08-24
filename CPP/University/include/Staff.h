#ifndef STAFF_H
#define STAFF_H
#include<string>

using namespace std;

class Staff
{
protected:
    string firstname;
    string lastname;

    public:
        Staff();
        Staff(string firstname);
        Staff(string firstname, string lastname);
        string getFullName();
        virtual ~Staff();

    protected:

    private:
};

#endif // STAFF_H
