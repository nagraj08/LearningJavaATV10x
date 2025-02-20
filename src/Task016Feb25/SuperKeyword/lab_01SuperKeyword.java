package Task016Feb25.SuperKeyword;

public class lab_01SuperKeyword {
    public static void main(String[] args) {
    testcase1 t1 = new testcase1("Chrome");
    t1.openBrowser();
        System.out.println("test case T1 running");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());
        testcase1 t2 = new testcase1(   "edge");
        System.out.println(t2.getBrowser());
    }
}

class Baseclass{
    private String browser;

    public Baseclass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
            System.out.println(this.browser=browser);
        }
        else
        {
            System.out.println("Change browser not allowed , not a admin");
        }
    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }
    void openBrowser(String browser){
        System.out.println("Open Browser!! -> " + this.browser);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class testcase1 extends Baseclass{

    public testcase1(String browser) {
        super(browser);// Call to my Parent Constructor
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Overi the parent Set Browser");
    }
}