package class23;

public class WebDriver {
    public void StartBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening a URL");
    }
    public void testPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the  browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void StartBrowser() {

        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the Chrome URL");
    }

    @Override
    public void testPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void StartBrowser() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening Safari browser URL");
    }

    @Override
    public void testPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}
class FireFox extends WebDriver{
    @Override
    public void StartBrowser() {
        System.out.println("Opening FireFox browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the FireFox URL");
    }

    @Override
    public void testPage() {
        System.out.println("Testing the login page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }
}
