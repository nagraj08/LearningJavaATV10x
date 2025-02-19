package Task016Feb25.ECAP;

public class lab_02_ECAP {
    public static void main(String[] args) {
        HDFCBank Nagraj = new HDFCBank("Bitla",1000);
        System.out.println(Nagraj.getAccNam());
        System.out.println(Nagraj.getBal());
        boolean isCashier = true;
        Nagraj.setBal(2000,isCashier);
        System.out.println(Nagraj.getAccNam());
        System.out.println(Nagraj.getBal());
    }

}

class HDFCBank{
    private String accName;
    private long bal;

    public HDFCBank(String accNamC, long balC) {
        this.accName = accNamC;
        this.bal = balC;
    }

    public String getAccNam() {
        return accName;
    }

    public void setAccNam(String accName) {
        this.accName = accName;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed to change balance");
        }
    }
}