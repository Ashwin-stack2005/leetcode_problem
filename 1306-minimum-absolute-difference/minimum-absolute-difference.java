class Solution {
public List<List<Integer>> minimumAbsDifference(int[] arr) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(arr);  // Step 1: Sort the array
    int mindiff = Integer.MAX_VALUE;

    // Step 2: Find the minimum difference between adjacent elements
    for (int i = 1; i < arr.length; i++) {
        mindiff = Math.min(mindiff, arr[i] - arr[i - 1]);
    }

    // Step 3: Collect all pairs with the minimum difference
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] - arr[i - 1] == mindiff) {
            List<Integer> pair = new ArrayList<>();
            pair.add(arr[i - 1]);
            pair.add(arr[i]);
            result.add(pair);
          }
      }
     return result;
   }
}