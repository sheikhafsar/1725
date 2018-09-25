#include <iostream>
#include "Vehicle.h"
#include "TwoWheeler.h"


using namespace std;

int main()
{
   // cout << "Hello world!" << endl;

   Vehicle vh= Vehicle(2009,"GA 08 A 1813",450000,"Afsar");
   vh.start();

   TwoWheeler tw=TwoWheeler();

   cout << "price: " << vh.getPrice() << endl;
    return 0;
}
