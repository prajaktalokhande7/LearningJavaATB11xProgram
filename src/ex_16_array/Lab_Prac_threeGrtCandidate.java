package ex_16_array;

public class Lab_Prac_threeGrtCandidate {

    public static void main(String[] args) {




       int[] a = {10,3,5,6,20};
        int[] b = {-10,-3,-5,-6,-20};
        int[] c ={1,-4,3,-6,7,0};
        int max =0,max1=0,max2=0;
        int maxb =0,max1b=0,max2b=0;
        for(int i=0;i<a.length;i++){

            if(a[i]>max){
                max=a[i];
            }
        }

        for(int i=0;i<a.length;i++){

            if(a[i]<max && a[i]>max1){
                max1=a[i];
            }
        }

        for(int i=0;i<a.length;i++){

            if(a[i]<max1 && a[i]>max2){
                max2=a[i];
            }
        }

        System.out.println("max of arry are"+max+"  "+max1+"  "+max2);

        int mul = max*max1*max2;

        System.out.println("multiplication of max 3 nos for array is :"+mul);

//***********************************array 2
        for(int i=0;i<b.length;i++){

            if(b[i]>maxb){
                maxb=b[i];
            }
        }

        for(int i=0;i<b.length;i++){

            if(b[i]<maxb && b[i]>max1b){
                max1b=a[i];
            }
        }

        for(int i=0;i<b.length;i++){

            if(b[i]<max1b && b[i]>max2b){
                max2=b[i];
            }
        }

        System.out.println("max of arry are"+max+"  "+max1+"  "+max2);

        int mul1 = maxb*max1b*max2b;

        System.out.println("multiplication of max 3 nos for array is :"+mul1);

    }

}
