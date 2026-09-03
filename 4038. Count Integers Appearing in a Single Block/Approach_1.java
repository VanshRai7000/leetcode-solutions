class Solution {
    private boolean Checkforconsecutive(List<Integer> indxarr) {
        for (int i = 0; i < indxarr.size() - 1; i++) {
            if (indxarr.get(i+1) - indxarr.get(i) > 1)
                return false;
        }
        return true;
    }

    public int countSpecialIntegers(int[] nums) {
       
        int n = nums.length;
        Map<Integer, List<Integer>> mymap = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!mymap.containsKey(nums[i])) {
                mymap.put(nums[i], new ArrayList<>());
            }
            mymap.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> e : mymap.entrySet()) {
            List<Integer> indxarr = e.getValue();
            if (Checkforconsecutive(indxarr) == true) {
                cnt++;
            }
        }
        return cnt;
    }
}