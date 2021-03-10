#include <iostream>                
#include <vector>
#include <string>
#include <sstream>

using namespace std;

void solve(vector<int> k) {
    for (int i = 0; i < k.size(); i++) {
        for (int j = 0; j < k.size() - i - 1; j++) {
            if (k[j] > k[j+1]) {
                int tempNum = k[j];
                k[j] = k[j+1];
                k[j+1] = tempNum;
            }
        }
    }
    for (int a = 0; a < k.size(); a++) {
        cout << k[a] << ' ';
    }
}

int main() {
    vector<int> regList;
    int val;
    string oriString;
    getline(cin, oriString);
    stringstream ss;
    ss << oriString;
    while (ss >> val) {
        regList.push_back(val);
    }
    solve(regList);
}
