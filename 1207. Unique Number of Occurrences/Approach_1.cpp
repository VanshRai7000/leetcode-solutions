class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int>mymap;
        for(int i = 0 ; i < arr.size(); i++){
            mymap[arr[i]]++;
        }
        
        unordered_set<int>myset;
        for(auto it : mymap){
            if(myset.contains(it.second) == false){
                myset.insert(it.second);
            }else{
                return false;
            }
        }
        return true;
    }
};