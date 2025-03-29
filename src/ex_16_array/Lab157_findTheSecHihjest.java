package ex_16_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab157_findTheSecHihjest {


    public static void main(String[] args) {
         int[]  num = {10,28,32,45,6,54};

        Arrays.sort(num);
        System.out.println(num[0]);
        System.out.println(num[num.length-3]);
    }


}
