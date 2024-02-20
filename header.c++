#include<iostream>
#include "boxArea.h"
#include "boxVolume.h"
using namespace std;
int main()
{
    float length,width,height;
    cout<<"enter the length, width,height of the box: ";
    cin>>length>>width>>height;
    boxArea(length,width,height);
    boxVolume(length,width,height);
    return 0;
}
