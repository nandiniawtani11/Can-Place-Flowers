class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
        int count=0;
        for (int i=0; i<length; i++) {
            if (bed[i]==0 && (i==0||bed[i-1]==0) && (i==bed.length-1 || bed[i+1]==0)){
                bed[i]=1;
                count++;
                if (count>=n) return true;
            }
        }
        return count>=n;
    }
}
