# 4043. Count Rotations With Exactly K Equal Adjacent Pairs

### Difficulty: Easy

## Description
You are given a string s of length n and an integer k.

A cyclic rotation of s is obtained by choosing a prefix of s whose length is between 0 and n - 1 (inclusive), and moving it to the end of the string while preserving the order of all characters.

For every cyclic rotation of s, let its score be the number of indices i such that 0 <= i < n - 1 and the characters at positions i and i + 1 are equal.

Return the number of cyclic rotations of s whose score equals k.

 
Example 1:


Input: s = "aab", k = 1

Output: 2

Explanation:

The cyclic rotations of s are:


	"aab": The characters at positions 0 and 1 are equal, so score = 1.
	"aba": No two adjacent characters are equal, so score = 0.
	"baa": The characters at positions 1 and 2 are equal, so score = 1.


Since score equals k for 2 cyclic rotations of s, the answer is 2.


Example 2:


Input: s = "abca", k = 0

Output: 1

Explanation:

The cyclic rotations of s are:


	"abca": No two adjacent characters are equal, so score = 0.
	"bcaa": The characters at positions 2 and 3 are equal, so score = 1.
	"caab": The characters at positions 1 and 2 are equal, so score = 1.
	"aabc": The characters at positions 0 and 1 are equal, so score = 1.


Since score equals k for only 1 cyclic rotation of s, the answer is 1.


 
Constraints:


	2 <= n == s.length <= 100
	s only consists of lowercase English letters.
	0 <= k <= n - 1

## Submission Details
- **Status**: Accepted
- **Runtime**: 59
- **Memory**: 17756000
- **Language**: cpp

## Code
```cpp
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
```
