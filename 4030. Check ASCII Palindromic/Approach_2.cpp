class Solution {
private:
    string getBinary(int val) {
        string ans = "";
        while (val >= 2) {
            ans = ans + to_string(val % 2);
            val = val / 2;
        }

        ans += to_string(val);

        if (ans.size() != 8) {
            int n = 8 - ans.size();
            while (n--) {
                ans += "0";
            }
        }

        reverse(ans.begin(), ans.end());

        return ans;
    }

public:
    bool isPalindromic(string s) {
        string ans = "";
        for (int i = 0; i < s.size(); i++) {
            int Asciival = s[i];
            string temp = getBinary(Asciival);
            ans += temp;
        }
        // Check for the pallindrome
        for (int i = 0; i < ans.size() / 2; i++) {
            if (ans[i] != ans[ans.size() - i - 1])
                return false;
        }
        return true;
    }
};