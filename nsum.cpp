#include <iostream>
using namespace std;

int main() {
    int a, ans = 0;
    cin >> a;
    for(int i = 0; i < a; i++) {
        int tmp;
        cin >> tmp;
        ans += tmp;
    }
    cout << ans << endl;
    return 0;
}