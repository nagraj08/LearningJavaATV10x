package Task016Feb25.AccessModifier.COP;

public class Cop {
    public int gun;
    boolean  iCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    protected void caniShoot(){
        System.out.println("Yes you can shoot!");
        iCard=true;
    }
    public void cannotShoot(){
        if(!iCard){
            System.out.println("Cannot Shoot!!");
        }
    }
}
