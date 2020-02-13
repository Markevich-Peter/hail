package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNDropPage extends Page {

  String url = "http://pw.staging.softjourn.if.ua/dragDropTest/";

  private String container = "//span[@class='title' and text()='Container']";

  public void openStartPage() {
    //driver.manage().window().maximize();
    driver.get(url);
    driver.manage().window().setSize(new Dimension(1600, 900));
    String currentWindow = driver.getWindowHandle();
    driver.switchTo().window(currentWindow);
  }

  public void dragNdropContainer() {
    Actions builder = new Actions(driver);
    WebElement element = driver.findElement(By.xpath(container));
    builder.clickAndHold(element).build().perform();
    //WebElement iFrame = driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(0);
    //WebElement iframe = driver.findElement(By.id("mouseposition-extension-element-full-container"));
    WebElement iframe = driver.findElement(By.xpath("//div[2]"));
    //iframe.click();
    //new Utils().highlightElement(driver, iframe);
    //WebElement to = iframe.findElement(By.xpath(".//..//div[2]"));
    builder.moveToElement(iframe).build().perform();
    builder.release(iframe).build().perform();
  }

  public void dragdrop() {
    WebElement LocatorFrom = driver.findElement(By.xpath(container));
    driver.switchTo().frame(0);
    WebElement LocatorTo = driver.findElement(By.xpath("//div[2]"));
    String xto = Integer.toString(LocatorTo.getLocation().x);
    String yto = Integer.toString(LocatorTo.getLocation().y);
    driver.switchTo().defaultContent();
    ((JavascriptExecutor) driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
                    "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
            LocatorFrom, xto, yto);
    //    ((JavascriptExecutor) driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
    //            "simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]);", LocatorFrom, 200, 400);
  }

  public void dragdrop1() {
    WebElement LocatorFrom = driver.findElement(By.xpath(container));
    ((JavascriptExecutor) driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
                    "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
            LocatorFrom, 400, 200);
  }
}
