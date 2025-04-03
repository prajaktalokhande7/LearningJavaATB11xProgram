package ex_19_Inheritance;

public class Testcase1 extends CommanToAll {

    void  runningTC1(){
        startBrowser();
        System.out.println("TC1");
        readFromDataBaseFile();
        closeBrowser();
    }
}
