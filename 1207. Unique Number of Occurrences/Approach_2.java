import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> myset = new HashSet<>();
        Map<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mymap.put(arr[i], mymap.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : mymap.entrySet()) {
            if (myset.contains(e.getValue()) == false) {
                myset.add(e.getValue());
            }else{
                return false;
            }
        }
        return true;
    }
}