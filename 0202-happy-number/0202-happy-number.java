class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            s=sqr(s);
            f=sqr(sqr(f));
        }
        while(s!=f);
        return s==1;
        
    }
    public int sqr(int n){
        int sqrsum=0;
        while(n>0){
            int r=n%10;
            n/=10;
            sqrsum+=r*r;
        }
        return sqrsum;
    }
}