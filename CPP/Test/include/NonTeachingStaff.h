#ifndef NONTEACHINGSTAFF_H
#define NONTEACHINGSTAFF_H

#include "Staff.h"
#include "Pay.h"

using namespace std;

class NonTeachingStaff : public Staff , public Pay
{
    public:
        NonTeachingStaff();
        virtual ~NonTeachingStaff();

        int Getage() { return m_age; }
        void Setage(int val) { m_age = val; }

    protected:

    private:
        int m_age;
};

#endif // NONTEACHINGSTAFF_H
