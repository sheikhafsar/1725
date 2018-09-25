#include "TwoWheeler.h"
#include <iostream>

TwoWheeler::TwoWheeler()
{

}

TwoWheeler::TwoWheeler(int noOfwheels,string nameOfVeh)
{
    noOfwheels=2;
    this->noOfwheels=noOfwheels;
    this->nameOfVeh=nameOfVeh;
}


TwoWheeler::~TwoWheeler()
{
    //dtor
}
