class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
    
        // to make sure that we known which is small or larger   
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        // populate hash map with the smaller array
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        // iterate over the larger array
        int k = 0;
        for (int n : nums2) {
            // get count for particular element 
            int cnt = m.getOrDefault(n, 0);

            // update the smaller array to save memory and decrease num 
            if (cnt > 0) {
                nums1[k++] = n;
                m.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}

