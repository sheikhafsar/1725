#ifndef VEHICLE_H
#define VEHICLE_H
#include <String>

using namespace std;

class Vehicle
{
    public:
        int year;
        string reg_num;
        float price;
        string owner;

        Vehicle();
        int getYear();
        void setYear(int year);

        string getReg_num();
        void setReg_num(string reg_num);

        float getPrice();
        void setPrice(float price);

        string getOwner();
        void setOwner(string owner);

        void start();
        Vehicle(int year,string reg_num,float price,string owner);
        virtual ~Vehicle();

    protected:

    private:
};

#endif // VEHICLE_H
