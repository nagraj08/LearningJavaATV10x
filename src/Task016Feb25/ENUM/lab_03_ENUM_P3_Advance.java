package Task016Feb25.ENUM;

public class lab_03_ENUM_P3_Advance {
    public static void main(String[] args) {
        System.out.println(Colours.RED.getHexcode());
        System.out.println(Locators.page_button.getLocator());
        System.out.println(Locators.page_input.getLocator());
        System.out.println(APIURLs.google.getApiurls());
    }
}
enum Colours{
    RED("#FF0000"),
    GREEN("61FF33"),
    BLUE("3377EE"),
    YELLOW("#4477FF");

    private String hexcode;
    Colours(String hexcode){
        this.hexcode = hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }}
enum Locators{
        page_button("#btn"),
    page_input("input1");
        private String locator;
        Locators(String locator){
            this.locator=locator;
        }
        String getLocator(){
            return this.locator;
        }
}
enum APIURLs{
        katalon("https://katalon.com"),
    google("https://google.com");
        private String apiurls;
        APIURLs(String apiurls){
            this.apiurls = apiurls;
        }
        String getApiurls(){
            return this.apiurls;
        }

}

