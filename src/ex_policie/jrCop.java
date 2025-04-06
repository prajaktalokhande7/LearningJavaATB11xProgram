package ex_policie;

import ex_policie.cop;

public class jrCop {

    public static void main(String[] args) {
        cop jr = new cop(5);
        //protected will be acessed in same pkg
        jr.canShoot();
    }
}
