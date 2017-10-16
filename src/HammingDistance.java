import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HammingDistance {




    public int hammingDistance(int x, int y) {
        int diff = 0;
        int size = 0;
        int distance=0;
        String binaryx = Integer.toBinaryString(x);
        String[] a = binaryx.split("");
        LinkedList arrayx = new LinkedList(Arrays.asList(a));

        String binaryy = Integer.toBinaryString(y);
        LinkedList arrayy = new LinkedList(Arrays.asList(binaryy.split("")));

        if (binaryx.length()>binaryy.length()) {
           size = binaryx.length();
        } else {
            size = binaryy.length();
        }
        diff = Math.abs(binaryx.length()-binaryy.length());

        for(int i=0; i< size ; i++) {
            if(arrayx.size()>arrayy.size()){
                while (diff != 0){
                    arrayy.addFirst("0");
                    diff--;
                }
                if (!arrayy.get(i).equals(arrayx.get(i))) {
                    distance++;
                }
            } else {
                while (diff!=0){
                    arrayx.addFirst("0");
                    diff--;
                }
                if (!arrayx.get(i).equals(arrayy.get(i))) {
                    distance++;
                }
            }

        }
        return distance;
    }

    public static void main(String[] args) {
        //System.out.println(Integer.toBinaryString(123));
        //String binaryInt = Integer.toBinaryString(123);
        //String[] a = binaryInt.split("");
        //for (String b:a) {
        //    System.out.println(b);
        //}
        //System.out.println(a.length);
        //String as = a[9];

        HammingDistance a = new HammingDistance();
        System.out.println(a.hammingDistance(3,1));
    }
}
