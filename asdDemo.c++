#include<iostream>

using namespace std;

class AccessSpecifierDemo{
    int privar;
    protected:
    int provar;
    public:
    int pubvar;
    void setvar(int pubval,int prival,int proval){
        privar = prival;
        pubvar = pubval;
        provar = proval;
    }
    void getvar(){
        cout<< "public : "<<pubvar<<endl;
        cout<< "private : "<<privar<<endl; 
        cout<< "protected : "<<provar<<endl;
    }
};

int main(){
    AccessSpecifierDemo obj;
    obj.setvar(10,20,30);
    obj.getvar();
}
