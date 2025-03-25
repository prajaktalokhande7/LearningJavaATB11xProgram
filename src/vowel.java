public class vowel {

    public static void main(String[] args) {

        String input = "hello";
        int vowels = 0;
        int cons = 0;

        input = input.toLowerCase();
        System.out.println(input);


        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e'){
                vowels++;
            }else {
                cons = cons +1;
            }
        }
        System.out.println(vowels);
        System.out.println(cons);
    }
}
