#ifndef PAY_H
#define PAY_H


class Pay
{
    public:
        Pay();
        virtual ~Pay();

        int GetPay() { return m_Pay; }
        void SetPay( int val) { m_Pay = val; }

    protected:

    private:
        int m_Pay;
};

#endif // PAY_H
