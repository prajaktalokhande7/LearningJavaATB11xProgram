package ex_08_multiarray;

public class Lab158_2darray {


    public static void main(String[] args) {

        //row-3
        //col=3
        //{{R1},{R2}.{R3}}
        int[][] array_2d_ols = {{1,2,3},{4,5,6},{7,8,9}};


        int[][] array;
        array = new int[][] {{2,3},{4,5},{6,7}}; //jagged array----rows and col are diff

        int[][] array_2d = new int[3][3];

        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;

        array_2d[1][0]=4;
        array_2d[1][1]=5;
        array_2d[1][2]=6;

        array_2d[2][0]=7;
        array_2d[2][1]=8;
        array_2d[2][2]=9;

        //1st row is created


    }


}
