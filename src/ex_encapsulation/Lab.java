package ex_encapsulation;

public class Lab {

    public static void main(String[] args) {
        login l = new login("admin","re34");



        goodLogin g = new goodLogin("sdsd","erer");
        System.out.println(g.getUname());

    }

}

class login{

    public String username;
    public String pwd;


    login(String user,String pwd){
        this.username = user;
        this.pwd = pwd;
    }

}


class goodLogin{

    private String uname;
    private String pswd;

    goodLogin(String user,String pwd){
        this.uname = user;
        this.pswd = pwd;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}