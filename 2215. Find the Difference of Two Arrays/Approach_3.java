class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mymap1 = new HashMap<>();
        Map<Integer, Integer> mymap2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            mymap1.put(nums1[i], mymap1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            mymap2.put(nums2[i], mymap2.getOrDefault(nums2[i], 0) + 1);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : mymap1.entrySet()) {
            int key = e.getKey();
            if (mymap2.containsKey(key) == false) {
                l1.add(key);
            }
        }
        for (Map.Entry<Integer, Integer> e : mymap2.entrySet()) {
            int key = e.getKey();
            if (mymap1.containsKey(key) == false) {
                l2.add(key);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}