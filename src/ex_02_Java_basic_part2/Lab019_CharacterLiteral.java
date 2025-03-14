package ex_02_Java_basic_part2;

public class Lab019_CharacterLiteral {

    public static void main(String[] args) {
        char c1 ='a';
        char c2 =' ';
        //escape character
        char new_line ='\n';
        char new1 = '\t'; //- gives tab

        // \b - delete a charachter
        // \r - carraige return

        System.out.println("hi, this is a firstline"+new_line+"test");
    }
}
