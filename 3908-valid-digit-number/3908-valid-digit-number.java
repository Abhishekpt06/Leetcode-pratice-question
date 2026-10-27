class Solution {
    public boolean validDigit(int n, int x) {
        boolean occurrence = false;
        while(n>0){
            if(n/10==0){              
                if(n==x) return false;
            }
            if(n%10==x) occurrence = true;
            n/=10;
        }
        return occurrence;
    }
}