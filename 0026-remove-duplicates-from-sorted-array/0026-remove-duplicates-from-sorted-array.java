class Solution {
  public int removeDuplicates(int[] nums) {
    int uniqueIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (uniqueIndex < 1 || nums[i] > nums[uniqueIndex - 1]) {
        nums[uniqueIndex++] = nums[i];
      }
    }
    return uniqueIndex;
  }
}
