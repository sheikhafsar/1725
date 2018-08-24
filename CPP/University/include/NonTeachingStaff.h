#ifndef NONTEACHINGSTAFF_H
#define NONTEACHINGSTAFF_H


class NonTeachingStaff : protected Staff
{
    public:
        NonTeachingStaff();
        NonTeachingStaff(string firstname, string lastname);
        virtual ~NonTeachingStaff();

    protected:

    private:
};

#endif // NONTEACHINGSTAFF_H
