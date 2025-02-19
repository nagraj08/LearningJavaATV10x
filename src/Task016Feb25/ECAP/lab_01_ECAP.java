package Task016Feb25.ECAP;

public class lab_01_ECAP {
    public static void main(String[] args) {
        VMOLogin vmoLogin = new VMOLogin("admin","pass123");
        System.out.println(vmoLogin.psw);
        vmoLogin.psw = "345";
        System.out.println(vmoLogin.psw);
        GoodEcapVMOLogin vmoLogin1 = new GoodEcapVMOLogin("admin123","pas1234");
        System.out.println(vmoLogin1.password);
        vmoLogin1.password="678";
        System.out.println(vmoLogin1.password);

        boolean isadmin = true;
        vmoLogin1.setPassword("123",true);
        vmoLogin1.getPassword();
        System.out.println(vmoLogin1.password);

    }
}
class VMOLogin{
    String UserName;
    String psw;
     public VMOLogin(String usr,String pswd){
         this.UserName = usr;
         this.psw = pswd;
     }
}
class GoodEcapVMOLogin{
    String username;
    String password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password, boolean isAdmin){
        if(isAdmin){
            this.password=password;
        }
        else {
            System.out.println("Not allowed to change the password");
        }


    }
    public GoodEcapVMOLogin(String usr, String psw){
        this.username= usr;
        this.password = psw;
    }


}
