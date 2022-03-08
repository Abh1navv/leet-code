class Solution {
    public int numberOfBeams(String[] bank) {

        int prev = 0, count = 0;
        for(int i=0; i<bank.length; i++) {
            int curr = countOnes(bank[i]);
            if(curr > 0) {
                count += curr*prev;
                prev = curr;
            }
        }
        
        return count;
    }
    
    public int countOnes(String bank) {
        return (int)bank.chars().filter(c -> c=='1').count();
    }
}