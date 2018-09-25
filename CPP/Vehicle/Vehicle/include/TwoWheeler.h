#ifndef TWOWHEELER_H
#define TWOWHEELER_H
#include <String>
#include "Vehicle.h"
using namespace std;


class TwoWheeler: public Vehicle
{
    public:
        int noOfwheels;
        string nameOfVeh;
        TwoWheeler();
        TwoWheeler(int noOfwheels,string nameOfVeh);
        virtual ~TwoWheeler();

    protected:

    private:
};

#endif // TWOWHEELER_H
