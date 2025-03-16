package ex_Task;

public class Lab_14mar_Increment {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // 11 + 11 + 12 = 34
        System.out.println(a);
        // 13
    }
}
