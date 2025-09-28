#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
using namespace std;


int main() {
    
    int n,q;
    cin >> n >> q;
    
    vector<vector<int>> array(n);
    
    for (int i=0; i<n; i++){
        int k;
        cin >> k;
        array[i].resize(k);
        
        for (int j=0; j<k; j++){
            cin >> array[i][j];
        }
    }
    
    for (int i=0; i<q; i++) {
        int x,y;
        cin >> x >> y;
        cout << array[x][y] << endl;
    }
    
    
    
    return 0;
}
