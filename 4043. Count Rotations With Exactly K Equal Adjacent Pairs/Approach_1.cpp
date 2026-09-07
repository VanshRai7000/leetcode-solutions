class Solution {
private:
    int checkforpair(string s, int k) {
        int cnt = 0;
        for (int i = 0; i < s.size() - 1; i++) {
            if (s[i] == s[i + 1]) {
                cnt++;
            }
        }
        return cnt;
    }

    string RotateStr(string s) {
        char first = s[0];

        for (int i = 0; i < s.size() - 1; i++) {
            s[i] = s[i + 1];
        }
        s[s.size() - 1] = first;

        return s;
    }

public:
    int countRotations(string s, int k) {
        int n = s.size();
        int ans = 0, j = n - 1, val = 0;

        val = checkforpair(s, k);

        if (val == k) {
            cout << val << endl;
            ans += 1;
        }
        string temp = s;
        while (j) {
            temp = RotateStr(temp);
            val = checkforpair(temp, k);
            if (val == k) {
                cout << val << endl;
                ans += 1;
            }
            j--;
        }
        return ans;
    }
};