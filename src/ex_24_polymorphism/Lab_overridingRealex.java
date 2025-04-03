package ex_24_polymorphism;

public class Lab_overridingRealex {
}

class CommonToAll{

    void openBrowser(){
        System.out.println("open browser");
    }
}

class chromeTC extends CommonToAll{

    @Override
    void openBrowser() {
        super.openBrowser();
    }
}