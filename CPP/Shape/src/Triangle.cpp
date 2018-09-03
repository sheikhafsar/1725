#include <iostream>
#include "Shape.h"
#include "Two_D_shape.h"
#include "Three_D_shape.h"
#include "Triangle.h"
#include "Cuboid.h"

using namespace std;


Triangle::Triangle()
{

}
Triangle::Triangle(int base,int height)
{
    this->base=base;
    this->height=height;
}
void Triangle::display_area()
{
    area=0.5*base*height;
    cout<<"area of triangle="<<area<<endl;
}


Triangle Triangle::operator+(Triangle obj)
{
        Triangle temp;
         temp.height=height+obj.height;
       temp.base=base+obj.base;
        return temp;
}


Triangle::~Triangle()
{
    //dtor
}
