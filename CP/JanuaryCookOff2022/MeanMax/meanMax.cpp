#include<bits/stdc++.h>
using namespace std;


#define all(cont) cont.begin(), cont.end()
#define ll long long
void solve()
{
        int q;
        cin >> q;
        vector<int> arr(q);
        for(int i = 0; i < q; i++)
            cin >> arr[i];
            sort(arr.rbegin(),arr.rend());
            int p = *arr.begin();
        
            int sm = accumulate(all(arr),0LL);
            double result = double(sm-p)/(q-1);
            result += p;
            cout << setprecision(12) << fixed;
            cout << result << '\n';

}

int main() {
    int t;
    cin >> t;
    while(t--) {
        solve();
        }
    return 0;
}