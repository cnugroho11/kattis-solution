#include <iostream>
using namespace std;

int main() {
    int tc = 0, counter = 1, disp = 0, time = 0;
    cin >> tc;
    if(tc % 2 == 0) {
        for(int i = 0; i < tc; i++) {
            int tmp;
            cin >> tmp;
            if(counter == 2){
                time = tmp - time;
                disp += time;
                counter = 1; 
            } else {
                time = tmp;
                counter++;
            }
        }
        cout << disp << endl;
    } else {
        cout << "still running" << endl;
    }
    return 0;
}