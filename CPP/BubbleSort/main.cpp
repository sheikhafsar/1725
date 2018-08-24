#include <iostream>

using namespace std;

int main()
{
    cout << "Bubble sort" << endl;

    int data[] = {1,5,2,9,33};
    int datasize = (sizeof(data)/sizeof(*data));

    cout << "INPUT";

    for(int i=0; i<datasize; i++){

        cout << "..." << data[i];
        for(int j=0; j<i; j++){
            if(data[i]<data[j]){
                data[i]+=data[j];
                data[j] = data[i] - data[j];
                data[i] = data[i] - data[j];
            }
        }
    }

    cout << endl << "OUTPUT";

    for(int i=0; i<datasize; i++){
        cout << "..." << data[i];
    }

    cout<< endl;

    return 0;
}
