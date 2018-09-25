#include <iostream>
#include"string"
#include "Shape.h"
#include "Two_D_shape.h"
#include "Three_D_shape.h"
#include "Triangle.h"
#include "Cuboid.h"

using namespace std;



Cuboid::Cuboid()
{

}
Cuboid::Cuboid(int len,int base,int height)
{
    this->len=len;
    this->base=base;
    this->height=height;
}
void Cuboid::volume_of_cuboid()
{
    volume=len*base*height;

     cout<<"length of cuboid="<<len<<endl;
      cout<<"base of cuboid="<<base<<endl;
       cout<<"height of cuboid="<<height<<endl;
    cout<<"volume of cuboid="<<volume<<endl;
}

void Cuboid::operator=(Cuboid obj)
{
    //Cuboid temp;
    len=obj.len;
    base=obj.base;
    height=obj.height;

   // return temp;
}

Cuboid::~Cuboid()
{
    //dtor
}
