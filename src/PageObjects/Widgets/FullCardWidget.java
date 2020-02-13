package PageObjects.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FullCardWidget implements Carousel {

    WebElement element;

    public FullCardWidget(WebElement element){
        this.element = element; //как скопировать НЕ ссылку на елемент а елемент
    }

    public void clickLeft(){
        element.findElements(By.xpath(".//button")).get(0).click();
    };

    public void clickRight(){
        element.findElements(By.xpath(".//button")).get(1).click();
    };
}
