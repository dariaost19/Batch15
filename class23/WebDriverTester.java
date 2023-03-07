package class23;

public class WebDriverTester {
    public static void main(String[] args) {
      //  WebDriver webDriver = new Chrome(); //upcasting
      //  webDriver.StartBrowser();
      //  webDriver.openURL();
      //  webDriver.testPage();
      //  webDriver.closeBrowser();
        // FireFox fireFox=new WebDriver();  down-casting not allowed
// below is an array of parent class that hold object of all child classes.
        WebDriver[] browsers= {new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers) { //this loop will give us all the objects ony by one
browser.StartBrowser();
browser.openURL();
browser.testPage();
browser.closeBrowser();

        }


    }
}

