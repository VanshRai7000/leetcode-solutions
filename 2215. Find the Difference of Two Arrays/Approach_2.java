class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set2 = new HashSet<>();
        Set<Integer>set1 = new HashSet<>();

        for(int val : nums1){
            set1.add(val);
        }

        for(int val : nums2){
            set2.add(val);
        }

        List<Integer>ans1 = new ArrayList<>();
        List<Integer>ans2 = new ArrayList<>();

        for(int val : set1){
            if(set2.contains(val) == false){
                ans1.add(val);
            }
        }

        for(int val : set2){
            if(set1.contains(val) == false){
                ans2.add(val);
            }
        }

        List<List<Integer>>result  = new ArrayList<>();
        result.add(ans1);
        result.add(ans2);

        return result;
    }
}