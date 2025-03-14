package ex_05_Typecasting;

public class Lab61_USE {

    public static void main(String[] args) {
        int crs =100;
        float gst = 18.54f;
        //nowrrowing has data loss in case of explisit casting
        int bill = crs+(int)gst;//widening
     //   int bill1 = crs+gst;//wrong ans will come

        float total = (float)crs+gst;//widning explicitly
        float total1 = crs+gst;
        System.out.println(bill);
        System.out.println(total);
    }
}
