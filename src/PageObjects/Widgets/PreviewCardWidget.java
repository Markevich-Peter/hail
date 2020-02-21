package PageObjects.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PreviewCardWidget implements Carousel{

    WebElement element;

    public PreviewCardWidget(WebElement element){
        this.element = element; //как скопировать НЕ ссылку на елемент а елемент
    }

    public void clickLeft(){
        element.findElements(By.xpath(".//button")).get(0).click();
    };

    public void clickRight(){
        element.findElements(By.xpath(".//button")).get(1).click();
    };

    public CardPagination getPagination(){
       return new CardPagination(element.findElements(By.xpath(".//ul/li")));
    }

    public void clickDetails(){
        element.findElements(By.xpath(".//*[text()='Подробнее']")).get(1).click();
    }
}
