#include "Vehicle.h"
#include <iostream>

Vehicle::Vehicle()
{
    //ctor
}

Vehicle::Vehicle(int year,string reg_num,float price,string owner)
{
    //ctor
    this->year=year;
    this->reg_num=reg_num;
    this->price=price;
    this->owner=owner;
}

int Vehicle::getYear()
{
  return year;
}

void Vehicle::setYear(int year)
{
    this->year=year;
}

string Vehicle::getReg_num()
{
  return reg_num;
}

void Vehicle::setReg_num(string reg_num)
{
    this->reg_num=reg_num;
}

float Vehicle::getPrice()
{
  return price;
}

void Vehicle::setPrice(float price)
{
    this->price=price;
}

string Vehicle::getOwner()
{
  return owner;
}

void Vehicle::setOwner(string owner)
{
    this->owner=owner;
}

//Methods
void Vehicle::start(){
 cout << "owner's Name: " << owner  << "Register Number:" << reg_num << "Vehicle Started " << endl;
}

Vehicle::~Vehicle()
{
    //dtor
}
