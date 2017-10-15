public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev=0;
        while(n!=0){
            rev = rev*10;
            rev = rev + n%10;
            n = n/10;
        }
        if(rev < 0){
            return false;
        }
        else if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return false;
        }
        else if(x==rev){
            return true;
        } else {
            return false;
        }
    }
}
