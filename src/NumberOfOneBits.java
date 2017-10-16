import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count=0;
        ArrayList<String> a =new ArrayList<>(Arrays.asList(Integer.toBinaryString(n).split("")));
        for (String s:a) {
            if (s.equals("1")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfOneBits a = new NumberOfOneBits();
        System.out.println(a.hammingWeight(57));
    }
}
