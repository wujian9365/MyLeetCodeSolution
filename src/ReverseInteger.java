public class ReverseInteger {
    public int reverse(int x) {
        long ans=0;
        int n = 0;
        while(x!=0){
            ans = ans*10;
            n = x%10;
            ans =ans + n;
            x = x/10;
            if( ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {return 0;} // balabalabala
        }
        return (int)ans;

    }
}
