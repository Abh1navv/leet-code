class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1, curr=0;
        while(i<j) {
            curr = numbers[i] + numbers[j];
            if(curr == target) {
                return new int[]{i+1, j+1};
            } else if(curr < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}