
#ifndef TRIANGLE_H
#define TRIANGLE_H
#include<iostream>
#include<string>
#include"Two_D_shape.h"

using namespace std;

class Triangle:public Two_D_shape
{
    public:
        int base;
        int height;
        Triangle();
        Triangle(int base,int height);
        Triangle operator+(Triangle obj);

        void display_area();
        virtual ~Triangle();

    protected:

    private:
};

#endif // TRIANGLE_H
