package ex_16_array;

public class Lab153_minmax_array {


    public static void main(String[] args) {


        int[] array={25,14,56,15,36,56,77,18,29,49};

        int max = give_me_max(array);
        System.out.println(max);





        }


        private static int give_me_max(int[] array){

            int max = array[0];

             for(int i=0;i<array.length;i++){



                 if(array[i]>max){
                     max=array[i];
                 }

             }

             return  max;
        }

    }

