#include <iostream>

using namespace std;

class Myclass {
    public:
    int myNum;
    string myString;
};

int main() {
    Myclass myObj; 
    
	myObj.myNum = 15;
    myObj.myString = "some next";
    
    cout << myObj.myNum << "\n";
    cout << myObj.myString;
    return 0;
}
