# 4030. Check ASCII Palindromic

### Difficulty: Easy

## Description
You are given a string s consisting of lowercase English letters.

Construct a binary string by replacing each character in s with the 8-bit binary representation of its ASCII value, including leading zeros, while preserving the original order of the characters.

Return true if the resulting binary string is a palindrome. Otherwise, return false.

 
Example 1:


Input: s = "ff"

Output: true

Explanation:


	The ASCII value of f is 102, whose 8-bit binary representation is 01100110.
	Thus, the binary string is 0110011001100110.
	Since this binary string is a palindrome, the output is true.



Example 2:


Input: s = "leet"

Output: false

Explanation:


	The ASCII values of l, e, e, and t are 108, 101, 101, and 116, respectively.
	Their 8-bit binary representations are 01101100, 01100101, 01100101, and 01110100.
	Thus, the binary string is 01101100011001010110010101110100.
	Since this binary string is not a palindrome, the output is false.



 
Constraints:


	1 <= s.length <= 100
	s consists of lowercase English letters.

## Submission Details
- **Status**: Accepted
- **Runtime**: 14
- **Memory**: 10280000
- **Language**: cpp

## Code
```cpp
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
```
