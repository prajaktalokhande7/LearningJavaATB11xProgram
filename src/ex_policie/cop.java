package ex_policie;

public class cop {

    public  int gun;
    String icard;

    cop(int bullet){
        this.gun=bullet;

    }

    protected void canShoot(){
        System.out.println("you can shoot");
    }

}
