package Task016Feb25.Inheritance.Inhertiance_single.RealExample;

public class TestCase2 extends CommonTOAllTest {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
