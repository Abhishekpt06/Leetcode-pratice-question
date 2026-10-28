class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n==0) return false;
        if(n==1) return false;
        
        int a=0, b=1,c=1;

        while(c <= n){
            int sum = a+b+c;
            if(sum==n) return true;

            a=b;
            b=c;
            c=a+b;

        }
        return false;
    }
}