#ifndef THREE_D_SHAPE_H
#define THREE_D_SHAPE_H
#include"Shape.h"


class Three_D_shape:public Shape
{
    public:

        int volume;
        Three_D_shape();
        virtual ~Three_D_shape();

    protected:

    private:
};

#endif // THREE_D_SHAPE_H
